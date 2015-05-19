-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Gazda: localhost
-- Timp de generare: 19 May 2015 la 16:37
-- Versiune server: 5.5.24-log
-- Versiune PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza de date: `rss_reader`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `ID_cat` int(9) NOT NULL AUTO_INCREMENT,
  `catName` varchar(30) NOT NULL,
  `color` varchar(7) NOT NULL,
  PRIMARY KEY (`ID_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `clients`
--

CREATE TABLE IF NOT EXISTS `clients` (
  `ID_user` int(9) NOT NULL AUTO_INCREMENT,
  `fName` varchar(30) NOT NULL,
  `lName` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`ID_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `ID_comment` int(11) NOT NULL AUTO_INCREMENT,
  `ID_user` int(9) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `message` text NOT NULL,
  PRIMARY KEY (`ID_comment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `ID_news` int(9) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `description` text NOT NULL,
  `guid` varchar(250) NOT NULL,
  `media` varchar(250) NOT NULL,
  `date` int(13) NOT NULL,
  PRIMARY KEY (`ID_news`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `repository`
--

CREATE TABLE IF NOT EXISTS `repository` (
  `ID_repository` int(9) NOT NULL AUTO_INCREMENT,
  `ID_user` int(9) NOT NULL,
  `ID_news` int(9) NOT NULL,
  `status` int(2) NOT NULL,
  PRIMARY KEY (`ID_repository`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `shares`
--

CREATE TABLE IF NOT EXISTS `shares` (
  `ID_share` int(9) NOT NULL AUTO_INCREMENT,
  `ID_sender` int(9) NOT NULL,
  `ID_news` int(9) NOT NULL,
  `ID_receiver` int(9) NOT NULL,
  PRIMARY KEY (`ID_share`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `subscriptions`
--

CREATE TABLE IF NOT EXISTS `subscriptions` (
  `ID_subscription` int(9) NOT NULL AUTO_INCREMENT,
  `ID_user` int(9) NOT NULL,
  `url` varchar(250) NOT NULL,
  PRIMARY KEY (`ID_subscription`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
