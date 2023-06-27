-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2023 at 07:54 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_crud`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_bayar`
--

CREATE TABLE `data_bayar` (
  `id_bayar` varchar(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `Keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_bayar`
--

INSERT INTO `data_bayar` (`id_bayar`, `nama`, `tanggal`, `Keterangan`) VALUES
('B01', '2023-06-08', '2023-06-08', 'dfgdfgdf');

-- --------------------------------------------------------

--
-- Table structure for table `data_warga`
--

CREATE TABLE `data_warga` (
  `id_warga` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jalan` varchar(100) NOT NULL,
  `no_rumah` varchar(5) NOT NULL,
  `rt` varchar(5) NOT NULL,
  `no_hp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_warga`
--

INSERT INTO `data_warga` (`id_warga`, `nama`, `jalan`, `no_rumah`, `rt`, `no_hp`) VALUES
(1, 'Yoko', 'Kenangan No 7', '111', '2', '081212341234'),
(2, 'Dimas', 'Mawar', '123', '1', '0823232123'),
(3, 'Ammar', 'Jambu', '34', '3', '0823223424');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`email`, `username`, `password`) VALUES
('admin@mail.com', 'admin', 'admin'),
('asu@mail.com', 'asu', 'asu'),
('awetawe', 'aerawer', 'aerawer'),
('a', 'a', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `tagihan`
--

CREATE TABLE `tagihan` (
  `bulan` varchar(50) NOT NULL,
  `nominal` int(50) NOT NULL,
  `untuk` varchar(50) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tagihan`
--

INSERT INTO `tagihan` (`bulan`, `nominal`, `untuk`, `keterangan`) VALUES
('April', 1000, 'Semua Warga', 'test'),
('April', 1000, 'Yoko', 'sad'),
('Januari', 45645, 'Ammar', '45645'),
('Januari', 567567, 'Yoko', '567567'),
('Mei', 23424, 'Dimas', '23424'),
('Januari', 23131, 'Ammar', '23131'),
('Januari', 34343, 'Yoko', '34343'),
('Januari', 23424, 'Pilih', '23424'),
('Januari', 345345, 'Yoko', '345345'),
('Januari', 45645, 'Ammar', '45645'),
('Januari', 345345, 'Semua Warga', '345345'),
('Januari', 456546, 'Dimas', '456546');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_bayar`
--
ALTER TABLE `data_bayar`
  ADD PRIMARY KEY (`id_bayar`);

--
-- Indexes for table `data_warga`
--
ALTER TABLE `data_warga`
  ADD PRIMARY KEY (`id_warga`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
