-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220508.7aa512c357
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2022 a las 23:48:52
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pok_mon`
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
  `TIPO` enum('AGUA','PLANTA','TIERRA','FUEGO','ELECTRICO','BICHO','VOLADOR') NOT NULL,
  `TIPO2` enum('AGUA','PLANTA','BICHO','ELECTRICO','TIERRA','FUEGO','VOLADOR') DEFAULT NULL,
  `NOM_POKEMON` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pokedex`
--

INSERT INTO `pokedex` (`NUM_POKEDEX`, `TIPO`, `TIPO2`, `NOM_POKEMON`) VALUES
(1, 'PLANTA', NULL, 'Bulbasaur'),
(2, 'PLANTA', NULL, 'Ivysaur'),
(3, 'PLANTA', NULL, 'Venusaur'),
(4, 'FUEGO', NULL, 'Charmander'),
(5, 'FUEGO', NULL, 'Charmeleon'),
(6, 'FUEGO', NULL, 'Charizard'),
(7, 'AGUA', NULL, 'Squirtle'),
(8, 'AGUA', NULL, 'Wartortle'),
(9, 'AGUA', NULL, 'Blastoise'),
(10, 'VOLADOR', NULL, 'Pidgey'),
(11, 'VOLADOR', NULL, 'Pidgeotto'),
(12, 'VOLADOR', NULL, 'Pidgeot'),
(13, 'ELECTRICO', NULL, 'Pikachu'),
(14, 'ELECTRICO', NULL, 'Raichu'),
(15, 'TIERRA', NULL, 'Sandshrew'),
(16, 'TIERRA', NULL, 'Sandslash'),
(17, 'FUEGO', NULL, 'Vulpix'),
(18, 'FUEGO', NULL, 'Ninetales'),
(19, 'TIERRA', NULL, 'Diglett'),
(20, 'TIERRA', NULL, 'Dugtrio'),
(21, 'FUEGO', NULL, 'Growlithe'),
(22, 'FUEGO', NULL, 'Arcanine'),
(23, 'AGUA', NULL, 'Poliwag'),
(24, 'AGUA', NULL, 'Poliwhirl'),
(25, 'AGUA', NULL, 'Poliwrath'),
(26, 'PLANTA', NULL, 'Bellsprout'),
(27, 'PLANTA', NULL, 'Weepinbell'),
(28, 'PLANTA', NULL, 'Victreebel'),
(29, 'TIERRA', NULL, 'Geodude'),
(30, 'TIERRA', NULL, 'Graveler'),
(31, 'TIERRA', NULL, 'Golem'),
(32, 'FUEGO', NULL, 'Ponyta'),
(33, 'FUEGO', NULL, 'Rapidash'),
(34, 'AGUA', NULL, 'Seel'),
(35, 'AGUA', NULL, 'Dewgong'),
(36, 'TIERRA', NULL, 'Rhyhorn'),
(37, 'TIERRA', NULL, 'Rhydon'),
(38, 'AGUA', NULL, 'Magikarp'),
(39, 'AGUA', NULL, 'Gyarados'),
(40, 'AGUA', NULL, 'Vaporeon'),
(41, 'ELECTRICO', NULL, 'Jolteon'),
(42, 'FUEGO', NULL, 'Flareon'),
(43, 'AGUA', NULL, 'Articuno'),
(44, 'ELECTRICO', NULL, 'Zapdos'),
(45, 'FUEGO', NULL, 'Moltres'),
(46, 'VOLADOR', NULL, 'Dragonite');

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



