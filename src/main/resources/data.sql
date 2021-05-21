-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Czas generowania: 20 Maj 2021, 11:50
-- Wersja serwera: 8.0.13-4
-- Wersja PHP: 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `z2HSannMds`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `otocars`
--

CREATE TABLE `otocars` (
                           `id` int(11) NOT NULL,
                           `mark` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
                           `model` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
                           `color` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
                           `year` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Zrzut danych tabeli `otocars`
--

INSERT INTO `otocars` (`id`, `mark`, `model`, `color`, `year`) VALUES
(1, 'Fiat', 'Bravia', 'czerwony', 1984),
(4, 'Fiat', '125p', 'zielony', 1989),
(5, 'Ford', 'Fiesta', 'zielony', 1995),
(6, 'Ford', 'Mustang', 'czarny', 2011),
(7, 'BMW', 'X7', 'czarny', 2015),
(8, 'Audi', 'Q7', 'niebieski', 2016),
(9, 'Mitsubishi', 'Outlander', 'czerwony', 2018);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `otocars`
--
ALTER TABLE `otocars`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `otocars`
--
ALTER TABLE `otocars`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
