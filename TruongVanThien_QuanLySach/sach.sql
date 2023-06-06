-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 05, 2022 at 09:08 AM
-- Server version: 5.5.34
-- PHP Version: 5.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `quanlysach`
--

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE IF NOT EXISTS `sach` (
  `maSach` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `tenSach` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `nhaXuatBan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `donGia` double NOT NULL,
  `maLoai` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`maSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`maSach`, `tenSach`, `nhaXuatBan`, `donGia`, `maLoai`) VALUES
('S01', 'lập Trình Java', 'TDC', 50000, 'SGK'),
('S02', 'Java Nâng Cao ', 'TDC', 120000, 'STK'),
('S03', 'Harry Potter', 'Kim Đồng', 35000, 'SKHVT'),
('S04', 'Conan', 'Kim Đồng', 15000, 'STT'),
('S05', 'Nhà Giả Kim', 'Nhà Xuất Bản Hội Nhà Văn', 60000, 'SGK');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
