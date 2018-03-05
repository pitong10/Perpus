-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2018 at 05:37 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE `data_buku` (
  `kode_buku` int(11) NOT NULL,
  `id_kategori` varchar(10) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `tahun_terbit` int(11) NOT NULL,
  `jum_halaman` int(11) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `keterangan` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`kode_buku`, `id_kategori`, `nama_buku`, `penerbit`, `kota`, `tahun_terbit`, `jum_halaman`, `kelas`, `keterangan`) VALUES
(1, 'nvl', 'Tomb Raider The Ten Thousand Immortals', 'Dark Horse', 'London', 2014, 839, 'Bebas', 'Tersedia'),
(2, 'nvl', 'The Girl on The Train', 'Paula Hawkins', 'Burnley', 2016, 879, 'Bebas', 'Tersedia'),
(4, 'pkt', 'Bahasa Inggris', 'Airlangga', 'Jakarta', 2006, 230, 'X', 'Dipinjam'),
(6787, 'nvl', 'Harry Potter and The Cursed Child', 'J.K Rowling', 'London', 2013, 1088, 'Bebas', 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `data_kategori_buku`
--

CREATE TABLE `data_kategori_buku` (
  `id_kategori` varchar(10) NOT NULL,
  `nama_kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_kategori_buku`
--

INSERT INTO `data_kategori_buku` (`id_kategori`, `nama_kategori`) VALUES
('crpn', 'Cerita Pendek'),
('nvl', 'Novel'),
('pkt', 'Paket');

-- --------------------------------------------------------

--
-- Table structure for table `melibatkan`
--

CREATE TABLE `melibatkan` (
  `id_peminjaman` varchar(40) NOT NULL,
  `kode_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `melibatkan`
--

INSERT INTO `melibatkan` (`id_peminjaman`, `kode_buku`) VALUES
('2-23022018-1293-nvl', 1),
('2-23022018-1293-nvl', 2),
('1-23022018-1393-nvl', 1),
('1-23022018-1393-nvl', 2);

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `no_induk` bigint(20) NOT NULL,
  `nama_siswa` varchar(50) NOT NULL,
  `jurusan` varchar(5) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `jekel` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telp` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjam`
--

INSERT INTO `peminjam` (`no_induk`, `nama_siswa`, `jurusan`, `kelas`, `jekel`, `alamat`, `no_telp`) VALUES
(1, 'John Cena', 'TKR', 'XII', 'Laki - Laki', 'Bc', 85980787897),
(2, 'Mikaela', 'TMM', 'XI', 'Perempuan', 'Jetis', 81264739303),
(123, 'Pitong', 'TMM', 'X', 'Laki - Laki', 'Ngaglik', 87703156387),
(1289, 'Kate Middleton', 'TAV', 'X', 'Perempuan', 'Buckingham Palace, England', 85938392342);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` bigint(20) NOT NULL,
  `nama_petugas` varchar(50) NOT NULL,
  `jekel` varchar(13) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telp` bigint(20) NOT NULL,
  `level` varchar(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `passwd` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama_petugas`, `jekel`, `alamat`, `telp`, `level`, `username`, `passwd`) VALUES
(1292, 'Dewi Khayangan', 'Perempuan', 'Sooko, Kota Mojokerto', 85363836332, 'Petugas', 'dewi', 'dewi'),
(1293, 'Deddy Corbuzier', 'Laki - Laki', 'Jetis, Mojokerto', 87675947499, 'Petugas', 'dedy', 'dedy'),
(1393, 'Retnowati', 'Perempuan', 'Mojolebak, Jetis, Mojokerto', 85648934878, 'Ketua', 'retno', 'retno');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_pengembalian`
--

CREATE TABLE `transaksi_pengembalian` (
  `id_pengembalian` varchar(40) NOT NULL,
  `id_peminjaman` varchar(40) NOT NULL,
  `nip` bigint(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah_denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_pengembalian`
--

INSERT INTO `transaksi_pengembalian` (`id_pengembalian`, `id_peminjaman`, `nip`, `tanggal`, `jumlah_denda`) VALUES
('20180226-2-23022018-1293-nvl-1293', '2-23022018-1293-nvl', 1293, '2018-02-26', 8000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_pinjam`
--

CREATE TABLE `transaksi_pinjam` (
  `id_peminjaman` varchar(40) NOT NULL,
  `no_induk` bigint(20) NOT NULL,
  `id_petugas` bigint(20) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date NOT NULL,
  `batas_pengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_pinjam`
--

INSERT INTO `transaksi_pinjam` (`id_peminjaman`, `no_induk`, `id_petugas`, `tgl_pinjam`, `tgl_kembali`, `batas_pengembalian`) VALUES
('1-22022018-1293-pkt', 1, 1293, '2018-02-22', '2018-08-24', '2018-08-25'),
('1-23022018-1393-nvl', 1, 1393, '2018-02-23', '2018-02-25', '2018-02-26'),
('123-22022018-1393-nvl', 123, 1393, '2018-02-22', '2018-02-24', '2018-02-25'),
('2-23022018-1293-nvl', 2, 1293, '2018-02-23', '2018-02-25', '2018-02-26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`kode_buku`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indexes for table `data_kategori_buku`
--
ALTER TABLE `data_kategori_buku`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `melibatkan`
--
ALTER TABLE `melibatkan`
  ADD KEY `melibatkan.peminjaman` (`id_peminjaman`),
  ADD KEY `melibatkan.buku` (`kode_buku`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`no_induk`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `transaksi_pengembalian`
--
ALTER TABLE `transaksi_pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD KEY `pengembalian.peminjaman` (`id_peminjaman`),
  ADD KEY `pengembalian.petugas` (`nip`);

--
-- Indexes for table `transaksi_pinjam`
--
ALTER TABLE `transaksi_pinjam`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `pinjam.peminjam` (`no_induk`),
  ADD KEY `pinjam.petugas` (`id_petugas`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD CONSTRAINT `data_buku_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `data_kategori_buku` (`id_kategori`);

--
-- Constraints for table `melibatkan`
--
ALTER TABLE `melibatkan`
  ADD CONSTRAINT `melibatkan.buku` FOREIGN KEY (`kode_buku`) REFERENCES `data_buku` (`kode_buku`),
  ADD CONSTRAINT `melibatkan.peminjaman` FOREIGN KEY (`id_peminjaman`) REFERENCES `transaksi_pinjam` (`id_peminjaman`);

--
-- Constraints for table `transaksi_pengembalian`
--
ALTER TABLE `transaksi_pengembalian`
  ADD CONSTRAINT `pengembalian.peminjaman` FOREIGN KEY (`id_peminjaman`) REFERENCES `transaksi_pinjam` (`id_peminjaman`),
  ADD CONSTRAINT `pengembalian.petugas` FOREIGN KEY (`nip`) REFERENCES `petugas` (`id_petugas`);

--
-- Constraints for table `transaksi_pinjam`
--
ALTER TABLE `transaksi_pinjam`
  ADD CONSTRAINT `pinjam.peminjam` FOREIGN KEY (`no_induk`) REFERENCES `peminjam` (`no_induk`),
  ADD CONSTRAINT `pinjam.petugas` FOREIGN KEY (`id_petugas`) REFERENCES `petugas` (`id_petugas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
