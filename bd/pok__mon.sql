-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2022 a las 14:01:08
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pokemon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `ID_ENTRENADOR` int(3) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `POKEDOLLAR` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `ID_ESTADO` int(3) NOT NULL,
  `NOM_ESTADO` varchar(20) NOT NULL,
  `NUM_TURNOS` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mejora`
--

CREATE TABLE `mejora` (
  `MEJORA` enum('ATAQUE_ESPECIAL','ATAQUE','DEFENSA','DEFENSA_ESPECIAL','VELOCIDAD') NOT NULL,
  `ID_MEJORA` int(3) NOT NULL,
  `CANT_MEJORA` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `ID_MOVIMIENTO` int(3) NOT NULL,
  `NOM_MOVIMIENTO` varchar(12) DEFAULT NULL,
  `CONSUM_ESTAMINA` int(3) NOT NULL,
  `POTENCIA` int(3) NOT NULL,
  `ID_ESTADO` int(3) DEFAULT NULL,
  `ID_MEJORA` int(3) DEFAULT NULL,
  `TIPO_MOVIMIENTO` enum('PLANTA','AGUA','FUEGO','ELECTRICO','VOLADOR','TIERRA') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokedex`
--

CREATE TABLE `pokedex` (
  `NUM_POKEDEX` int(3) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `TIPO` enum('AGUA','PLANTA','TIERRA','FUEGO','ELECTRICO','BICHO','VOLADOR') NOT NULL,
  `TIPO2` enum('AGUA','PLANTA','BICHO','ELECTRICO','TIERRA','FUEGO','VOLADOR') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon_entrenador`
--

CREATE TABLE `pokemon_entrenador` (
  `ID_POKEMON` int(10) NOT NULL,
  `ID_ENTRENADOR` int(10) NOT NULL,
  `NUM_POKEDEX` int(3) DEFAULT NULL,
  `MOTE` varchar(10) DEFAULT NULL,
  `VITALIDAD` int(2) DEFAULT NULL,
  `DEFENSA` int(2) DEFAULT NULL,
  `DEFENSA_ESPECIAL` int(2) DEFAULT NULL,
  `ATAQUE` int(2) DEFAULT NULL,
  `ATAQUE_ESPECIAL` int(2) DEFAULT NULL,
  `VELOCIDAD` int(2) DEFAULT NULL,
  `ESTAMINA` int(4) DEFAULT NULL,
  `NIVEL` int(2) DEFAULT NULL,
  `EXPERIENCIA` int(4) DEFAULT NULL,
  `FERTILIDAD` int(1) DEFAULT NULL,
  `ID_EQUIPO` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `ID_TIPO` bigint(1) NOT NULL,
  `NOM_TIPO` enum('FUEGO','AGUA','PLANTA','ELECTRICO','TIERRA','BICHO','VOLADOR') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`ID_TIPO`, `NOM_TIPO`) VALUES
(1, 'FUEGO'),
(2, 'AGUA'),
(3, 'PLANTA'),
(4, 'ELECTRICO'),
(5, 'TIERRA'),
(6, 'BICHO'),
(7, 'VOLADOR');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pokedex`
--
ALTER TABLE `pokedex`
  ADD PRIMARY KEY (`NUM_POKEDEX`);

--
-- Indices de la tabla `pokemon_entrenador`
--
ALTER TABLE `pokemon_entrenador`
  ADD PRIMARY KEY (`ID_POKEMON`),
  ADD KEY `NUM_POKEDEX` (`NUM_POKEDEX`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`ID_TIPO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pokemon_entrenador`
--
ALTER TABLE `pokemon_entrenador`
  ADD CONSTRAINT `pokemon_entrenador_ibfk_1` FOREIGN KEY (`NUM_POKEDEX`) REFERENCES `pokedex` (`NUM_POKEDEX`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
