-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2022 a las 20:10:41
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
-- Base de datos: `pokémon`
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
  `NOMBRE` varchar(20) DEFAULT NULL,
  `IMAGEN` blob DEFAULT NULL,
  `SONIDO` blob DEFAULT NULL,
  `TIPO` enum('PLANTA','FUEGO','AGUA','TIERRA','ELECTRICO','VOLADOR') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon_entrenador`
--

CREATE TABLE `pokemon_entrenador` (
  `ID_POKEMON` int(10) NOT NULL,
  `ID_ENTRENADOR` int(10) NOT NULL,
  `NUM_POKEDEX` int(3) NOT NULL,
  `MOTE` varchar(10) DEFAULT NULL,
  `VITALIDAD` int(3) DEFAULT NULL,
  `DEFENSA` int(3) DEFAULT NULL,
  `DEFENSA_ESPECIAL` int(3) DEFAULT NULL,
  `ATAQUE` int(3) DEFAULT NULL,
  `ATAQUE_ESPECIAL` int(3) DEFAULT NULL,
  `VELOCIDAD` int(3) DEFAULT NULL,
  `ESTAMINA` int(3) DEFAULT NULL,
  `NIVEL` int(3) DEFAULT NULL,
  `EXP` int(3) DEFAULT NULL,
  `FERTILIDAD` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`ID_ENTRENADOR`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`ID_ESTADO`);

--
-- Indices de la tabla `mejora`
--
ALTER TABLE `mejora`
  ADD PRIMARY KEY (`ID_MEJORA`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`ID_MOVIMIENTO`),
  ADD KEY `ID_ESTADO` (`ID_ESTADO`),
  ADD KEY `ID_MEJORA` (`ID_MEJORA`);

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
  ADD KEY `NUM_POKEDEX` (`NUM_POKEDEX`),
  ADD KEY `ID_ENTRENADOR` (`ID_ENTRENADOR`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD CONSTRAINT `movimiento_ibfk_1` FOREIGN KEY (`ID_ESTADO`) REFERENCES `estado` (`ID_ESTADO`),
  ADD CONSTRAINT `movimiento_ibfk_2` FOREIGN KEY (`ID_MEJORA`) REFERENCES `mejora` (`ID_MEJORA`);

--
-- Filtros para la tabla `pokemon_entrenador`
--
ALTER TABLE `pokemon_entrenador`
  ADD CONSTRAINT `pokemon_entrenador_ibfk_1` FOREIGN KEY (`NUM_POKEDEX`) REFERENCES `pokedex` (`NUM_POKEDEX`),
  ADD CONSTRAINT `pokemon_entrenador_ibfk_2` FOREIGN KEY (`ID_ENTRENADOR`) REFERENCES `entrenador` (`ID_ENTRENADOR`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
