-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-08-2023 a las 01:59:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nesflisejextra`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seriespeliculas`
--

CREATE TABLE `seriespeliculas` (
  `id_Contenido` int(11) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Formato` varchar(20) NOT NULL,
  `Creador` varchar(50) NOT NULL,
  `Estreno` int(11) NOT NULL,
  `Puntaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seriespeliculas`
--

INSERT INTO `seriespeliculas` (`id_Contenido`, `Titulo`, `Formato`, `Creador`, `Estreno`, `Puntaje`) VALUES
(12, 'El planeta de los simios', 'novela', 'Peter Jackson', 1963, 10),
(13, 'El planeta de los simios', 'pelicula', 'Franklin Schaffner', 1968, 8),
(14, 'Escape del planeta de los simios', 'pelicula', 'Arthur P. Jacobs', 1971, 7),
(15, 'Conquista del planeta de los simios', 'pelicula', 'arthur P. Jacobs', 1972, 7),
(16, 'la batalla del planeta de los simios', 'pelicula', 'Arthur P. Jacobs', 1973, 9),
(17, 'El planeta de los simios', 'serie', 'Mort Abraham', 1974, 7),
(18, 'El regreso del planeta de los simios', 'serie', 'De pati-Freleng Enterprises', 1975, 7),
(19, 'El planeta de los simios', 'comic', 'El planeta de los simios franquicia', 1975, 8),
(20, 'El planeta de los simios', 'pelicula', 'Tim Burton', 2001, 8),
(21, 'El planeta de los simios: evolucion', 'pelicula', 'Ruppert wyan', 2011, 8),
(22, 'El planeta de los simios: confrontacion', 'pelicula', 'matt Reeves', 2014, 9),
(23, 'La guerra del planeta de los simios', 'pelicula', 'Matt reeves', 2017, 10),
(24, 'Transformers G1', 'Comics', 'Franklin Schaffner', 1980, 8),
(25, 'Transformers:la guerra de cibertron', 'serie', 'jeremy Stuart', 2021, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  ADD PRIMARY KEY (`id_Contenido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  MODIFY `id_Contenido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
