-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 04, 2012 at 09:40 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tourtravel`
--

-- --------------------------------------------------------

--
-- Table structure for table `travelplanner`
--
CREATE DATABASE `tourtravel`;
USE `tourtravel`;
CREATE TABLE IF NOT EXISTS `travelplanner` (
  `tour_id` int(11) NOT NULL AUTO_INCREMENT,
  `tour_src` varchar(20) NOT NULL DEFAULT 'NULL',
  `tour_dest` varchar(20) NOT NULL DEFAULT 'NULL',
  `tour_via` varchar(20) NOT NULL DEFAULT 'NULL',
  `tour_tagent` varchar(20) NOT NULL DEFAULT 'NULL',
  `tour_date` date NOT NULL,
  `tour_name` varchar(20) NOT NULL DEFAULT 'NULL',
  PRIMARY KEY (`tour_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `travelplanner`
--

INSERT INTO `travelplanner` (`tour_id`, `tour_src`, `tour_dest`, `tour_via`, `tour_tagent`, `tour_date`, `tour_name`) VALUES
(1, 'kota', 'blr', '', 'goibibo', '2012-11-18', 'asd'),
(2, 'hyd', 'blr', '', 'goibibo', '2012-11-05', 'asd'),
(3, 'hyd', 'blr', '', 'goibibo', '2012-11-05', 'asd'),
(4, 'blr', 'goa', '', 'yatra', '2012-11-20', 'goGoa');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
