-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2022 a las 21:11:45
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `educa22604`
--
CREATE DATABASE IF NOT EXISTS `educa22545` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `educa22545`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE IF NOT EXISTS `alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_escuela` int(11) DEFAULT NULL,
  `legajo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `nota` decimal(10,0) DEFAULT NULL,
  `grado` int(11) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_escuela_id_idx` (`id_escuela`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `id_escuela`, `legajo`, `nombre`, `nota`, `grado`, `email`) VALUES
(1, 2, 1000, 'Ramón Mesa', '8', 1, 'rmesa@mail.com'),
(2, 2, 1002, 'Tomás Smith', '8', 1, ''),
(4, 1, 101, 'Juan Perez', '10', 3, ''),
(5, 1, 105, 'Pedro González', '9', 3, ''),
(6, 5, 190, 'Roberto Luis Sánchez', '8', 3, 'robertoluissanchez@gmail.com'),
(7, NULL, 106, 'Martín Bossio', NULL, 3, ''),
(8, 4, 100, 'Paula Remmi', '3', 1, 'mail@mail.com'),
(9, 4, 1234, 'Pedro Gómez', '6', 2, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escuelas`
--

CREATE TABLE IF NOT EXISTS `escuelas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `escuelas`
--

INSERT INTO `escuelas` (`id`, `nombre`, `localidad`, `provincia`, `capacidad`) VALUES
(1, 'Normal 1', 'Quilmes', 'Buenos Aires', 250),
(2, 'Gral. San Martín', 'San Salvador', 'Jujuy', 100),
(3, 'Belgrano', 'Belgrano', 'Córdoba', 150),
(4, 'EET Nro 2', 'Avellaneda', 'Buenos Aires', 500),
(5, 'Esc. N° 2 Tomás Santa coloma', 'Capital Federal', 'Buenos Aires', 250);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
