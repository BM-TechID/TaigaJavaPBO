-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2023 at 09:03 PM
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
-- Database: `taiga`
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
(3, 'Ammar', 'Jambu', '34', '3', '0823223424'),
(4, 'ty', 'ty', 'ty', 'ty', '6256467');

-- --------------------------------------------------------

--
-- Table structure for table `pengeluaran`
--

CREATE TABLE `pengeluaran` (
  `kode` varchar(10) NOT NULL,
  `tanggal` date NOT NULL,
  `nominal` int(100) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengeluaran`
--

INSERT INTO `pengeluaran` (`kode`, `tanggal`, `nominal`, `keterangan`) VALUES
('311830a864', '2023-07-10', 1000, ''),
('4421360075', '2023-07-10', 1000, 'sadas');

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
('fgasd@mail', 'yoko', '7f878e68fc1300c46a548255e31578f6'),
('asdfa@mail.cim', 'dimas', '7d49e40f4b3d8f68c19406a58303f826');

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

-- --------------------------------------------------------

--
-- Table structure for table `total`
--

CREATE TABLE `total` (
  `nominal` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `total`
--

INSERT INTO `total` (`nominal`) VALUES
(98000);

-- --------------------------------------------------------

--
-- Table structure for table `total_uang`
--

CREATE TABLE `total_uang` (
  `kode` varchar(36) NOT NULL,
  `tanggal` date NOT NULL,
  `nominal` int(50) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `total_uang`
--

INSERT INTO `total_uang` (`kode`, `tanggal`, `nominal`, `keterangan`) VALUES
('35b92a0f-5414-40c3-ac3e-74757f0e8546', '2023-07-09', 10000, 'Ammar Melakukan Pelunasan'),
('4601d809-f7e6-407d-9b01-976d67a4725b', '2023-07-09', 20000, 'Ammar Melakukan Pelunasan'),
('4af558f0-94f0-418b-9186-adde28b4a94c', '2023-07-09', 50000, 'Ammar Melakukan Pelunasan'),
('b61d4575-cd1e-4de5-878a-0da8c795caf4', '2023-07-09', 726322, 'ty Melakukan Pelunasan'),
('e0e3bae7-ef3f-4851-a5bf-542bae85cbba', '2023-07-09', 257669, 'Pilih Melakukan Pelunasan'),
('e1c5456a-15fe-47d0-b8e8-70d7c6e6ccc6', '2023-07-09', 346345, 'Semua Warga Melakukan Pelunasan'),
('e30fa060-41ac-4caf-bf34-d8cfaa5d8bcd', '2023-07-09', 4545, 'Dimas Melakukan Pelunasan'),
('ed3a6f22-dec0-4ab9-9ec0-09e30f3739d9', '2023-07-09', 234461431, 'Dimas Melakukan Pelunasan'),
('f75bacc5-f601-4937-84dc-a6d30f7c15c2', '2023-07-09', 949255, 'Yoko Melakukan Pelunasan');

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

--
-- Indexes for table `pengeluaran`
--
ALTER TABLE `pengeluaran`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `total_uang`
--
ALTER TABLE `total_uang`
  ADD PRIMARY KEY (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
