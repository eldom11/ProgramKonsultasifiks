-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Des 2023 pada 03.41
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `konsultasi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `ID_Doc` varchar(5) NOT NULL,
  `Nama_Doc` varchar(25) NOT NULL,
  `No_Telpon_Doc` varchar(13) NOT NULL,
  `Jenis_Kelamin` enum('Pria','Wanita') NOT NULL,
  `Pendidikan_Terakhir` varchar(50) NOT NULL,
  `Spesialis` varchar(25) NOT NULL,
  `username_dokter` varchar(25) NOT NULL,
  `Password_dokter` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`ID_Doc`, `Nama_Doc`, `No_Telpon_Doc`, `Jenis_Kelamin`, `Pendidikan_Terakhir`, `Spesialis`, `username_dokter`, `Password_dokter`) VALUES
('10YU', 'Farrel Faksi Aditya', '081234567890', 'Pria', 'S1 Kebidanan', 'Bidan', 'farrel123', 'farrel123'),
('27JFD', 'Elia Martini', '081299887766', 'Wanita', 'S3 Dokter Gigi', 'Dokter Gigi', 'chacaja', 'chacaja123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` varchar(5) NOT NULL,
  `Nama_Pasien` varchar(30) NOT NULL,
  `Usia` int(3) NOT NULL,
  `Jenis_Kelamin` enum('Pria','Wanita') NOT NULL,
  `No_Telpon` varchar(13) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `Nama_Pasien`, `Usia`, `Jenis_Kelamin`, `No_Telpon`, `Username`, `password`) VALUES
('00MRW', 'Eldoni Mosul', 20, 'Pria', '081292060496', 'eldom.11', 'maeldozapuva11'),
('43EP', 'Elraza Moenaf', 19, 'Pria', '081296177990', 'elraza2112', 'elraza2112');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasienkonsul`
--

CREATE TABLE `pasienkonsul` (
  `Id_Konsul` varchar(5) NOT NULL,
  `Id_pasien` varchar(5) NOT NULL,
  `Nama_Pasien` varchar(30) NOT NULL,
  `No_Telpon` varchar(13) NOT NULL,
  `ID_Doc` varchar(5) NOT NULL,
  `keluhan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pasienkonsul`
--

INSERT INTO `pasienkonsul` (`Id_Konsul`, `Id_pasien`, `Nama_Pasien`, `No_Telpon`, `ID_Doc`, `keluhan`) VALUES
('YW567', '00MRW', 'Eldoni Mosul', '081292060496', '27JFD', 'Sakit Hati');

-- --------------------------------------------------------

--
-- Struktur dari tabel `riwayatkonsul`
--

CREATE TABLE `riwayatkonsul` (
  `Id_Konsul` varchar(5) NOT NULL,
  `Id_pasien` varchar(5) NOT NULL,
  `Id_Doc` varchar(5) NOT NULL,
  `Keluhan` varchar(30) NOT NULL,
  `Tanggal_konsul` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `riwayatkonsul`
--

INSERT INTO `riwayatkonsul` (`Id_Konsul`, `Id_pasien`, `Id_Doc`, `Keluhan`, `Tanggal_konsul`) VALUES
('YW567', '00MRW', '27JFD', 'Sakit Hati', '2023-12-20');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`),
  ADD UNIQUE KEY `Nama_Pasien` (`Nama_Pasien`),
  ADD UNIQUE KEY `No_Telpon` (`No_Telpon`,`Username`,`password`);

--
-- Indeks untuk tabel `riwayatkonsul`
--
ALTER TABLE `riwayatkonsul`
  ADD PRIMARY KEY (`Id_Konsul`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
