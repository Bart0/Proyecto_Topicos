-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2016 a las 17:14:30
-- Versión del servidor: 5.7.9
-- Versión de PHP: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `capital` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombre`, `apellidos`, `ciudad`, `direccion`, `capital`) VALUES
(0, 'Julio', 'Arceo Miranda', 'Sahuayo', 'Prados verdes', '5000'),
(1, 'Alfonzo', 'Ramirez', 'Zamora', 'madero norte 67', '56000'),
(2, 'Christian ', 'Gonzalez', 'Jiquilpan', 'Morelos', '20000'),
(3, 'juan', 'Sanchez', 'zamora', 'Arboledas no. 34', '200004');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `idempleado` int(11) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `puesto` varchar(20) NOT NULL,
  PRIMARY KEY (`idempleado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idempleado`, `nombre`, `apellidos`, `direccion`, `telefono`, `fecha`, `puesto`) VALUES
(0, 'Polo', 'Garcia', 'Lomas Verdes 45', '3512347634', '12-02-1985', 'gerente'),
(1, 'Homero', 'Simpson', 'El Paraiso 56', '3512345634', '24-03-1991', 'Cajero'),
(2, 'Miguel', 'Corona', 'Los Alpes 45', '3513452376', '23-05-1992', 'Cajero');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
