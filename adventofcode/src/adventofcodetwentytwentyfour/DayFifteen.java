package adventofcodetwentytwentyfour;
import java.util.ArrayList;
import java.util.HashMap;

import utils.Util;
public class DayFifteen {
	//static String map = "###################################################.O.O.#..O...OO.O..#.......O#..O.OO..O..#.OOOOO.O##.#OO.....O...OO....OOO.OOO...#OO..O.#..O.OOO..O.##..O.O.#..OOO.....#OO.O####.OO..OO#O...O#.....O..##........#...O..O.OOO.........O....#O..#O.....#..##OO.O#.O..O...O..O.........#..O....O.O.O..OOO...###........O..OO...O.#O...O....#.O...O..O.#..OO..O.##.O.......#O.#O.OO...O...#OO....O.O...OO...O.OO.###.#..O.OO....OO.O#..OO..OO...O..#.....O.O.......###........O.....OO.O.OO....OOOO..OOO#.#O....O.OO.O##..O.O.##OOO#..#..#O#.O#O.#..OO.OOO...OO.O.......##OO.O#.O.....#...OO..O..#.....O.OO..O...OO...O.O.##.OO.OO...OO....O.#.O.....O....#O....#O....O.O..O##.......#.O....O...#....O.O..O......#....O..OOO..##.........O...OO....OO.#O...O.O..O...O.O#...#O...##O......O.....#....OO#OO...OO..O.....O.#...O..O..##OO..O......O#OOO...O...O#.O.OO....OOO.#.....O.O.##.O...OO..#O.#.#..OOOO##.O#.....O....OO......O#OO##O......#..O.O..#...OOO.O.....#....O.O.O..O......##.##.#O.O...O...O.#..O...OO.OO...OO.....O.....OO.##..#.....O......O#...#OO..O........O..O...#..#.#.##..O..O#O#OO....#...O.OO..#..........O.OO.#O.O...##..O#.O.O.O...O.OO..O.O.O.O.O.O...OOO#.#.O##.O...##O....O..O.OO.OOO..OOOOOO.O.OO..O...O..O....O..####...OO.O..OO..O...#....#@...O.O...OO.O#.....O...O##.....#...OO..O...O.......#.OO..#.O....O..#..O..###....OOOO...#..#O........O.OOOO..O........#O..O..##....O....##.....O..O....O#....O...O.OO.....OO...##O..#....O...O.OOO.O..O......O..#O.#.O.O.O...OO..##..O##O.#.......O.......O..O......#.OO..O...OOO#O##....O#O..#..O.#O......O..#OO...OO....##O.......O##....O...O......O.....O.O.O..OO...#......O.#.#...##..O..O.......#O........O.#....O..O....#.O.O#O..O###..........#...O.......O.O....OO.#OO.O.#....O..O##.O........#.#OO.O.O..#O..OO..O#O...O.O.O.OO.#O.O##.#OO..OO.....O...O.O...O...O.OO........O#O...O.O##..O.O#.O.......O....OO....#O.OOO...#...OOO...#..##...#OOO#.....#......#O....O..O.#......O........O##.....O...O#O..O..O...#.O.O..O#..#OO.....OOO...O.##O.O....OO.O...#O..O..O##....O..O.....#.O....OO.O##.....#OOO.O....OO.O.....OO......O.OOO....#....#O##....OO..O..O.O...O.OO.O..#..O.....O.#....OO.O...###.O...OO#O..#....O...O.O...#..O.......#....O#..###..O.O...O...O#.O.O...OOO...O.OOO.....O.OO....O..##O..O.OO#.O#OO....#O.O...O.......O...OO.....O..O.##........O......#O.......#O#........O.OO.O..O##..##.#..O.OO#..#...O..O#.O.....#O..#...#....O#O.....##.O.O...O....O.O..O................#..OO...O..O.O##O..OO..#.O.O#.O.#OO...OO..O..O...O.O..O#.OO.O.O.###################################################";
	static String map = "######################################################################################################..[]..[]..##....[]......[][]..[]....##..............[]##....[]..[][]....[]....##..[][][][][]..[]####..##[][]..........[]......[][]........[][][]..[][][]......##[][]....[]..##....[]..[][][]....[]..####....[]..[]..##....[][][]..........##[][]..[]########..[][]....[][]##[]......[]##..........[]....####................##......[]....[]..[][][]..................[]........##[]....##[]..........##....####[][]..[]##..[]....[]......[]....[]..................##....[]........[]..[]..[]....[][][]......######................[]....[][]......[]..##[]......[]........##..[]......[]....[]..##....[][]....[]..####..[]..............##[]..##[]..[][]......[]......##[][]........[]..[]......[][]......[]..[][]..######..##....[]..[][]........[][]..[]##....[][]....[][]......[]....##..........[]..[]..............######................[]..........[][]..[]..[][]........[][][][]....[][][]##..##[]........[]..[][]..[]####....[]..[]..####[][][]##....##....##[]##..[]##[]..##....[][]..[][][]......[][]..[]..............####[][]..[]##..[]..........##......[][]....[]....##..........[]..[][]....[]......[][]......[]..[]..####..[][]..[][]......[][]........[]..##..[]..........[]........##[]........##[]........[]..[]....[]####..............##..[]........[]......##........[]..[]....[]............##........[]....[][][]....####..................[]......[][]........[][]..##[]......[]..[]....[]......[]..[]##......##[]......####[]............[]..........##........[][]##[][]......[][]....[]..........[]..##......[]....[]....####[][]....[]............[]##[][][]......[]......[]##..[]..[][]........[][][]..##..........[]..[]..####..[]......[][]....##[]..##..##....[][][][]####..[]##..........[]........[][]............[]##[][]####[]............##....[]..[]....##......[][][]..[]..........##........[]..[]..[]....[]............####..####..##[]..[]......[]......[]..##....[]......[][]..[][]......[][]..........[]..........[][]..####....##..........[]............[]##......##[][]....[]................[]....[]......##....##..##..####....[]....[]##[]##[][]........##......[]..[][]....##....................[]..[][]..##[]..[]......####....[]##..[]..[]..[]......[]..[][]....[]..[]..[]..[]..[]..[]......[][][]##..##..[]####..[]......####[]........[]....[]..[][]..[][][]....[][][][][][]..[]..[][]....[]......[]....[]........[]....########......[][]..[]....[][]....[]......##........##@.......[]..[]......[][]..[]##..........[]......[]####..........##......[][]....[]......[]..............##..[][]....##..[]........[]....##....[]....######........[][][][]......##....##[]................[]..[][][][]....[]................##[]....[]....####........[]........####..........[]....[]........[]##........[]......[]..[][]..........[][]......####[]....##........[]......[]..[][][]..[]....[]............[]....##[]..##..[]..[]..[]......[][]....####....[]####[]..##..............[]..............[]....[]............##..[][]....[]......[][][]##[]####........[]##[]....##....[]..##[]............[]....##[][]......[][]........####[]..............[]####........[]......[]............[]..........[]..[]..[]....[][]......##............[]..##..##......####....[]....[]..............##[]................[]..##........[]....[]........##..[]..[]##[]....[]######....................##......[]..............[]..[]........[][]..##[][]..[]..##........[]....[]####..[]................##..##[][]..[]..[]....##[]....[][]....[]##[]......[]..[]..[]..[][]..##[]..[]####..##[][]....[][]..........[]......[]..[]......[]......[]..[][]................[]##[]......[]..[]####....[]..[]##..[]..............[]........[][]........##[]..[][][]......##......[][][]......##....####......##[][][]##..........##............##[]........[]....[]..##............[]................[]####..........[]......[]##[]....[]....[]......##..[]..[]....[]##....##[][]..........[][][]......[]..####[]..[]........[][]..[]......##[]....[]....[]####........[]....[]..........##..[]........[][]..[]####..........##[][][]..[]........[][]..[]..........[][]............[]..[][][]........##........##[]####........[][]....[]....[]..[]......[]..[][]..[]....##....[]..........[]..##........[][]..[]......######..[]......[][]##[]....##........[]......[]..[]......##....[]..............##........[]##....######....[]..[]......[]......[]##..[]..[]......[][][]......[]..[][][]..........[]..[][]........[]....####[]....[]..[][]##..[]##[][]........##[]..[]......[]..............[]......[][]..........[]....[]..####................[]............##[]..............##[]##................[]..[][]..[]....[]####....####..##....[]..[][]##....##......[]....[]##..[]..........##[]....##......##........[]##[]..........####..[]..[]......[]........[]..[]....[]................................##....[][]......[]....[]..[]####[]....[][]....##..[]..[]##..[]..##[][]......[][]....[]....[]......[]..[]....[]##..[][]..[]..[]..######################################################################################################";
//	static String map = 
//			  "####################"
//			+ "##....[]....[]..[]##"
//			+ "##............[]..##"
//			+ "##..[][]....[]..[]##"
//			+ "##....[]@.....[]..##"
//			+ "##[]##....[]......##"
//			+ "##[]....[]....[]..##"
//			+ "##..[][]..[]..[][]##"
//			+ "##........[]......##"
//			+ "####################";
	static String inputs = "^>^>^<^>>v>v<v<^^>>>v>v^<>v^<^<><vv>v<v>^<>^>v^v><<<v>^<v^>^v^^<><>v>>vv<><^^><>^><v^vv>^^<<<^<><>v<>^vv<vv>>>>v^vvvvv>>^<>>v<^<><><v>>v^><v^v>v^v>><<>><^<^^>v>>^><><vv<<>^^v>v<<>vv<>v<v<><<>>v><<>^<>v^><><v^v^>^<^^<>^<<<^^>v^<v^v><><vv>^><^v>><vv<v<v<<^^><^v<vv^>^>vv>^><<^^>>v>>>^>^v<v<^<^v<<>^^v^vv>vv<v<<v^v^v<>vv><^><^<<<<>^>>>v^>v<v>><<<v^^^vv<<<^vv^>^>^^<vv<^>>v^><vv^<<>^^^^>^v>^v<^>>^<^>^>^>^^>>^<><^<>^>^v^><><^v><^v>v^>^v<<^<>>v^vv>v<v^vv^<<>>^><^<<v><v>v>v>>^v<^><><^<<<>>>>^v<<v>>^><<vv<<>>v>v^>v^^^<>>><v><v<^^<>^^^<>>>>^>v^v<^v>>v^^<vv>vv<<v>>v<>v<<^v>v^^<<^v<v<^>><>>vv>^>>^^^<^<><>^v^v^^<<v<>>><^>><><><<v<v><<v^><v<<>v><v^v>^>v<^^^^>>v<<v^><^>>>vv<v>>>><<<<>>><^<vv><<>>>^v>><<><><^v<^<v^<^><v^<<^<v<<<^v<^^v>^>vv<><><><v>v<v>vv><<>^v<v<v^<vvvv^<>v^v^<>^^^v^><<<vv^<vv^v<><v^^>^v^<v^<>^v><^><^^>v><><v<v<vv><>vv^v<<^^<^><^<^<^>v>v^^>>>v><><>^<v^>><v^v^^<>v^v^^>v<v>>vv<<>vv>^v<<^v>vv^v>^^<><>^^>^^<>vvv><^v^v><v^v^><^v<^<^^<><><^<v>^^<v>^<^<><^v<>^<>v>vv^v<^<^v<<<>>>vvvv>vv^^^<^>><><^<><v<>^v^v^^<^>>^^v^^>v><<^v^<><>v<>^v<>v<><>^v>>>>v<^v^^vvv^>>^>v<^<>>v^vvv<v>v^<<v><v>v<^<^^<^<^>>>><v^^><^^>>>^^v>>>^vv^^v<v^^^^v<<>^><<><<<<>>v^^<>>v<<^<>>^>v^<^v<v<v<^^^^v><<^<v<v<<>^^v^v^><vv>v>^<<<v>vvv<^<>>>v<><>v>>>>^v^^^<<v<<v>v>^v<<^v<<vvv>v^>^^<><<<v>^^<>>>><<<<<v^<>v<^>v>^<<>^^v<<^vvv<v><>^>^>v^>><>^^v>v^^<v^^^^<^>>^^v><^<>v<vv^v^>^v^<v<<<^^v>>^>^^^^><<<^^>v<^^><v>>^^v>^<>>vv^>>><^<>>><>>^>v>vv^vv^>v><><^<^<^>>>v^<<^v>v^v<><^^^>>v<^>>>v^>v<^>><<v>v>v^><<><^<>v^^>v<v>>v^<^^<<<>v^>v>^<<v^v^v>v><<^vv<^v^^^^^>^>v><^<v>^^v>v^>>>^^v<<<v>><vv^^v^<^v>v<vvvv>vvv<>^vvv>^^v^vvv<><><^>>v^^vv<^^v^>vv^^^<>><<>vv>>^<vvv<^^^v>v>^^<v>^><v<^>>^v^^v^v>^<><^^>v>><^v>>^<<<^><^^^>v^<>><^><<>>><vvv^<v^v<<><v<<>>vv^^v>><>^<^>><>^^<^<>>>vvv<^>vvv<>^>>^<>v<>vv>v>v^>^v^<>v>v>^^^<^><><v^>>><vv^>^v>vv><<^>^^^^^>>v^><^^<^^vvv>^>>v^vvv^>>^<v^>v^v>^^><v>v^vv^>><>^^v>><>vv^>vv>><v><<<<<v<v<v><^>v^v><^v^^<v<><<^>^^><v>vv<><^^>vv>^<<><<<^^>^<<<v<^>^<v>>^^><v^<>^<<>^^^<v<><>^<>^^v<v^^v>>><<v<^^v>><v>><><<v<><^v<v^v<>^<^^<<^^^^^^v>>>vv<v<<<<v^<>vv>^<vvv<<^^>^><>><><<vv<><^><^>v^^^^^v>>>^v^<<^v>v^v^<v>^<><<v<v>^v<>>v<vvv<>>v><<^<>><><^^^^vv><<v^vv>^^<v<^<>v^>^v^<>vv^vv><^<v><^>^>v^><^v<<<^>^^<^>^^v^<vv<<<v>v>>^v^v^>vvv><>^v^^<vv<^v>vv>v^<><<<><^>v^^^^>><<^vv^>>vv^><vvv^v^<^<>>^<>^v^^<^<^<>v^vv<v><vvv<><<^vv>><<v<<^<>^^vv>v^<^><><vv<<v^^^^vv>>><>>^^vv^>v^<v^<vv^v^^v^v<<v>>v><v^><<v^>>^><v<^v>^>^vv<>>v><^<^v^<^^>v<v>v<^v^^v<<<<^><<v<<v^vvv<<v>>><<<>>^>v>v^>^^v><<<>v^>^>v^v>>^>v<<<<^<<<<v>vv<v^>vv<>>^v<<v<<^v<^^<^vv><>>^^^><v>v<vv^>v>^<^^vv^^>>>v<^><v^>v<v<v^v^>^v<^<>>>v<<vv<^>^v<>^<>^<<^<v>^<v<^^v<<>>^<>v^v^><<<>>v<^>^vvv^<<^<<v^vv>>^^v^<>><<<<^><<>v>^>^>><<v<>^v>^^v>>>^>v>^<v><>v^>vvvv<<^v>>>^<<^^v>vv>v>>v^>>^<vvv<<<vv>vvv^v<v<<^<vv<<^^<<^><^^v>^<vvv<^<>>^>^<>>>^><<<<<v><^><<vv><^>v>><^>>><>v<><^^<v^>^<v<>>>^v<^>><v>v^>^v^^<^<>v>v^^v<^v<^<<^vv^<>v>^^v^<v<v^<><vv>v^<<>>^vvv<<v^v<<^v>>v<^^<<^^v<^><<v^v<v><v>>>>>><<^^vvv<^^><>>v^<vvv<vv>v<^><^<^<<^<^^^<^v^^>>^>vv<v>vvv<>^^v<<><^vv>><^><<v><>><><<^>>^^<<>>v<>v^^v><<^<>>^<^^v<<<><^vv^^^v<>>><^vv^<^^^<vv^^>v<v^<><^<>v>^^<v^vv<<v^<^v>>v^^>^^^^^^>^vvvv>>v<v<<^><^^^vv^^^>><<^>^>^>>v^^v>>^v>>v^v^>v>v^>^><^><^>>v<^v><>>><>>>>^>v<><>^v<vv>^<^vv^^<^<>^v<><<<>>v^<<vv<v><<<><^>>vv<v^><<>^^v<<^v<>^^<vvv<>v^<<vv<<^v^^vv<<<>>>><>>v^v<^>>^<vvv>^^>^v^<<<v<^>>>^v<>v^><>v><<>^<^^^<^>^v><v^^>^<<^<^v^^>>v<>^<^>><<><><vvv<v^^<<<><>^v>><v>><<<vvvv<v^v^v^^<<v^><<<<>^>>vv^v<v^v>^>v^<v><<v<<^<v<<<>>v^>v^^vv<^^>^v>^<>v<<>v><v<^<^^><<^>^<<>^><>>^^>^<^v><><<<^v>><<^v>v>v><>^^v^<<v>><^<<^^v<v>^>^^<>>>^>^^>vvv>^<v<vvv^><^<<>v>vv<^^v^v^vv<<>><^<>><^v>v><v<<^v<<>v^<v><<<<>><v>>>^<^^<>v><<>>v<vv^>>vv<><^^^^v<>>^<<^<v<v>v<<<^^^v<^<vv<^<^vvvv>>v^<<^<<vv<v<v<<<><><v<^<><<<vv>^^v^<v<^^^^<<<^>>>>>^^<vv>^^^>^<><><>vv<<^^>>>^^^^<<>v^><vv>v>v<<><<^<<<^>^^v<v>>^^><v^v<><<<v>^><v^v<>v>v>v^>>v^><>^^>^>^vv<^^v^^v<>>vv<^v>v^v<>v<<><^<^<>>^^vvvv>^>^><^v<v<^<<^<>vv>v^^>>^<>^^^vv^>^v^>^^>^v>>vv^<^><<><^v^<>>><><^^<^v<^vv><v>>^><v^v><vv^>^^v<<>v<^v<>vv<^v<v^^^<v^v><<v^>^^^^>><>>>>v^<<<>^><<<v<v^^>v<^<v^<^vv<vv>><vv<<<v<<>^>v>>v><>><<<^^<v^<^vv<>><v<^<><>^<<<^^v>^vv<>vv<^>^^v>^v><^v^>v^<v^vvv<^v<><>v<<>vv<^><vvv^>>>v<^<^>v>v^><v>^^^>^>>^^<v><^^<v<v<<><>vv<<vv<><^>vv>vvv<^v^v^^>v<><><^<vv^^vv<^^v><^^v<<>>v<<<^^v><vv>vv<^<><vv^^v><^>^>>^>^^<^<<^<<<^^vv>^<v^>v<<<<^>^>>>^<v>>>>v>><^>>>^v<^vvv^v^v<v<^^<>^>^<^^^v>v^<^^<>><<<^>v<^>^^^^<^^<><^<v<>v^<v^^^><<>>vv^^v>v>v>>>^v<>><vvv<v><v>>v<^<^vvv><v>^>^<><>^><v<<<<>>>v^>>v^<>v<<>v><^v^><vvvv^v><<vv^v^^^>v^>>vv^^>^>^<<v^v<v><v><vv<^^<<v<^><>v<<^^<^v><vv<><v^>>^>><<v>><^^v^^<><<^>v>>^^v><<v>^^^^v>^v>>^v^v<<<^^^<v>^^^v><^>^><^^>^^><v>^>v>>>>>^v><^>^^v<>v<vv<vvv^^v>^>vv>v<^>^<^<>>^<v>^>>v>v^vv^>>^><<^^<v<^<<<<^v<^<>^>^v^v<^>vvv>^>><v<>^<vv<v>^><>><>v<v<>v<<>>vv>v^>^>>^>^><v<<v^>^>^v<<<<<^v<>^^>><^^<>>^^^<v<<><<<^<>>^<>^^>>v>^<>>v<^v^^<^^>v^>^>^v>^>v<v<>^v><>v<<>^v<<^>v^<><v>v>v^>><<<^^>^^^<v>^<><<^<><>^<<^>^>><<>>vv><v><v^>>>^vv>>v>v<<^<^v^>vv<^^>^v<^^^v<<>^<<>^>v<>>^vvv<<<^>vv>v<<<<<v>v><><v<^vv^^<>vvv<v^v>v^vv^^vv^^<>^>^v><>^^^vv>>>v><<v>vv^vv<^>v>v^><>v<^^<^<v^v^^>^>^<><^>^^^^<^<^^^^>v<^>v>^^>^<>><v^^v<^>v><<^<^v>>vv<v^>>^<>><^vvv^><<^v^<<^^><<<^<<^><^<>>>>><^><<<<<^<^^<<v><<<v^vv<^v><<v><v^<<<v>^>^^^>^^><^<^^^^>>>v^^^>><^<^^>v^^v><<>^>v>^<^<v>^>><^<vv<>^v<^v<<^v<<vvv^vv^>vvv^^v^^vv^vv>>v<<>>><v>><>vv<<^<<^^>^>>>^<<^^^<<<v<^>>v^<^v<<>^v>>v^><><>>>^<^vv^><<<vv><>>^<^^<^<<>^^<^><>^^v<v>^^><v<^<>><<<^v<^^<v^>v^<v<<v<v^>vv>><>^>>^<^<>^^v<^<^<>vv^>^v^v>>v>>v<^vv>><^<>v>^^>^^>^^vv<^><vvv<>><>v><v<^<vvvv^<v^>^>^>^vvv>><<vv>v^v^><^<v>><^>^^<^<>v<^^<^v>v<<<>>^<vv^<>v^<v><>vv>v>v<vv<^<v>^^vv^<^v>^>^<>><<^^><^>^^><>v^v^><<^^<^>>v<><v^><<v^<<v><<vv^v>>^^^<>><^^<vv^<<><^>v<^v>^>^>^><v>v^vvv^vv^v<v<><^^v>^>^>v<<<<<>^<v^<><<^>>^v<^<v><v>^<^^^^><^^v<><<><v^^vvv>v^^vv>^^<^^<^v<>^v><>>v>^^<>>v^v^>^<v>v>>^<^vvv^>>^>v<>>v<v>vv<>^^v^^vvv<^<>^>>v<^v<^<^v^^^>><<vv>><<^vv>>^v>^v<<v<<<<v<^^>>v<<>>>>><^^<<<>>^<v^v^>>><^>>v<^><^^^<^^>>><>^v>vv<^^>^^^^<^><>>v>v^<v>v^^>>^<^^><<^v><>><<<<^vvv<<>^>^><<vv<<v>><v<<<v>^><v^v>^<<^<v><^><<^v<^>>^>>>vv>^v^>^>^<^v<>vv^>^^<<^<^^><<<><><<v<>v<^v<^^^v<v>^>^<<^><^^^v>vv><<>v<><^^v<^>><v<v<^vv<^><v>v>^<<^^v<>>^v<<^<<>^v^<v<<v<><><<>v<<>v>>vvvv>v<>^v>v><>vvv^vvv^^v>v>>>^v<>><<<<^^^>>><><^^>v>^^<>^v>>v<v^<>v^^v<^<>>vvv<vv^<<<<>>^<><<<><>^^vvv>^vvv<>>^^<^><<>>><>>^^<><>><>vv><v>v>>^<<<^vvv^>v^<>v>^<><><<<<>v>^v>^^vv<v>^>^v<^^v^^<<^^^v^><<v^<<>^^v^^^>^^^<v<>>>v<>vv>vv>^vv^<>^v><^>><^^<^<^>^<^v<>^<<<v^<v><v^>v<^vv<><v^<v<<^^<^^>v<v<v<^<^^^>^^<><^>v^v>^<<^^v<^><>><<<>v<>v<<>>^>v<v<v<<^<<<>v><^<v>>v^^>v<^<>v^^<><<>>v^><v<v^^<<<><vv^^<v<v^^<^>^^v^v>^v<<><vv><^<^v><v<vv>v^>^v^>vvvv><><<v<^<v<^>^^<>v><v>>^v^<v^<^>v>^>^v<><v>><vv><<v<>v>>>^^^^>><<><^^<^v^<^^v^^<v^><<<^v^^v<^<><^><^^>>v<<<v<v<v^vv^v^><>^^<^vv>^>>^<^^>^<<<<^v<v<<<^v>^><>>^>>>^v<>><^<^v>^v>>v<<^v>^<v<<>^^^>v><v^>>v^^>vv><v^>^v^><v<^vv^^<v<v<v^>^>^>>^^>v>v<<>^^v^^v>>^^^>^v^v^^^v^<><v<v^v^>^^^v^vv^<<<v^v<<>><<vv><^<v<v<vv>><vv<vvv<^<<^<<<>v<vv^><><<^vvv^>>^<><<^^>v^>^v><<><><<>^v<^<><^^^<v<^^<><^v^<<^v<v<^>>v^<^>>v>>><^<>v>>><^v>>vvv^>vv<^vv<^>>^>^>v>v<<v<^<vv^>><>>>v>>v>^^>^^vv<^v<>>>^^^v^v^><><v<v^<>>^><<>^<>><>>><>>v>^><v^><^^v<^^<^v>^v<>>^v<<vv<vv^<<<^>^<^>vv^^v>>v<v^^v<v<<<^^v^<v>>>v<<<<^^>>><v<<>>><^v^<>>>>>>^<<^^^<<v><<>^^v^^^^v^<^^><vv>>v><v><v^v>vvvv^^^<<vvv<v^>^^vv^v^^^^^^<v^>^^^>v<<<><v^v^^^<v><^v>>>^>>v^<v>^<v^^>>^<>v<<>vv<v>>v><v^^>^vv>><^v<vv<^^v^v>>^<vv^><v<v^v^v>^><>^v<v<<>^^<^^<>v>>>^<>v<^<<vv^^>^<v^^^vv<>^>^^v><v^>v^v>^^<^>v^<<<<<<<^>><v^>>v<>v<^^<>v>v^^v^^^v>^v^^<<<^<v^><>v><<^^^v^^^^v>>vv<>vv>v><<vv^<vv<>^^>><><<v<v^>v^v>>^^<><>vv>><v^v<<v<v<<<^^vv^>^vv^>v^<<<^vv<>>vv^>v^^>^<^><>^v<<><<vv>>>^>vv<^v^>v>v<^^^><><vv<<<<^<>><<^v<<v^<v^><>v<v^>><^>v>^><^^^>^^^>vv>^<v><<^^v<v>^^vvv<v<>vv<>><^v>>>v^>^v^^>^>^<^^v<<<<v^^>^v>><^<>v<^>v>^<<<v<vv^<^v^>>>>>><<^^v<^>v>>^v>><><>>^<<^v^>>>^<v<><^><>><v^^>^>v>^v>v^v>vvv>^>vv>vvv><^v>>v^>>><<<vv<v<^<^v>>>v><^>>v^<^>><<<<>>>><^^>^v>v^v<^<<>vvv>><^>>v><^><>><^>>>><><^>><^<><<>><vv><v^^<>vv^^>v<>^v>><v>^<^><^<>v<>><<>>>^><vv>v<>^^vv<><vvv^^vv>v^<<<^v>>^^>>>v>>>v<^>v><v<<>v^v><><<^>>^^<^><<vvv<v<vvv^<<v<^<<<>>>v>><v^><v>>vv^^<v>>>^v^>><vv^vv^>v>>>v<vv>vv><^>v^^v^vvv<^v^<v><v<vv^><>^><^^><>^vv<<^>vv^>>^>v^<<<<>v^^<^^^^<^>>v<<>>^<>^<<vv><>v>vv^><vvv<<<^vv^^>>v^>>v>vv>v<^<>^v<^^vv^>v^^>v>>v>>^^><v<<v>vv<v>vvv<>vv>><<>>v^^<<^^>vv>^>^v>^^v>^<vv^v<v>v<^v^v^v><v<v^v^<^vv<^<v<<>><^v^>>>><^v<vvvv<>^>^vv>>v<<>^^v^v>v^v^<^^^><v^v>v^><>vvv>vv^>>^<>^<^^<<<<^>>v^v<>v<^vv^<<^v>^^<><<^>><>vv<vv<<><vv>>>>>>vv<>>><><v^<v>v<<><v<>^>^^>v^v^<vvv^v^>v^<v<^<<<>vv^^<^><<<><>v^>vv>vvv><^<v<>>vv>vv^<v^>>^<><<>^v^^^^^<^^<>v>>v<<v><vv^v<vv<^v^>><<^<<<<<v^><>^><v<^>v<vvv^><v^<>^^<^<v<><<v^v<^^>^^vvvv^<><>v^v>>vv<>^<vv^>>v<v>>>v^v^^>v<>^v<>><^>>v<>^<<vvv><vv><v><vv^<<><<<>v^^<<<^<^^v>vvvvv<v>^^vv>v^<^^v^<>v>^<v>v>^^^<<^v>^^<>^^<<v^><^v^<<>><^<v><><<v<><vvv^>>^<v>v^^^^>^>>^<<vvvv>v><v><>>>^<^vvv^<^<<^^vvvv^vvvvvv>vvv^<^<>>>v>v^>><>v<<^vvv^^v>^<<^^^^<>v<<v>v^<>^^<>v<v>^v<<<v^^v<>>vvv^><>>vv^>^v^>v^v^<v<v<>^>^<^>^<vvv<>vvv<<v^>><v<>^><^<>v>>>^>v^<><>^^>v^<>^^vv>^>^^>>^v>vv^^v^v>>vv>^v<^>v>v><<^>^^<v>v<vv><^^<<^^<><<v<>^^v><><<<<^<^v>v<v>^>v><^<<^^<<v><^v><^^^vv>^>^v^><<^v<v<>^<^^<^<<<^v<v^><vvv>vv>vv^v^^^v>v<^>vv><v^^<^v<v<^v><<^<v<v>v^v^>^>v>>^<<^><^^v^>>><^vv<>>>>^^>>v>^<vvv^^vv>vv>>^vv<^v<v><v^>>>^^v^v^^^<>>>^^><^v^<>^<>vv>>>^vv^<<vv>v><^^^vv><^>>><^v>>^>v^v>^^<^^>>v>^^v<>><v<^>^v>v<>^<<<<^<><><<^>><<v<v^<vvvv>^^v<><><v>^>v>^v^<<>>^^v>v>^^v^<>^vv>>vv<^^><v>^v^^<^^<<v^v><^v><><v>v<>v<vv>^^<>vv<<>^^<>>>v<<>v>vv^^v<>vv^>^v^>^vv><>>v>>^^vvv<v<>>>>>vv^>><^<>>>v^><^<<>vvv><vv><>^<^<^vvvvvv>^v>>v^>^>vvv^^>>^>>^v>>^<v^<^>><<>v^>^^v<v>>>><^v<^vv<>v^^<^<^><^v<^^><^<^>v^<^v>^^vv<><<>>^v^>v><v<<^v<v^^v>>>v^v>^vv<v<<>>^vvv<v><>v^><^<v<^v><v><<>><>v><^>^<^>^^<v<v^>>v^^vv^>^v>><^^v>>v<<^><vv>v<><v>>>>v^v>v>^>^vvv^^^><>><v>^vv<><^<v<vvv>v><<^^>^><vv><v^^v<>^v><^v^<><<^<^vv<>v>^^<>>^><v^>vvv>v>v^<^>>^^><><>>>>v><<vv^v<v>vv<<><>><v<^<<^^<>^<^<^<^>^v^>^^v<><<v<^>v<<<v><>v>v<<^<vv>^<<><>vvv>>><<^^v^>v><>^><vv>v<^vv><v<v^>^v^>>>v>^v<>><^>>^v^^>^<^<<vv^>^v<^v^>v^>v>^>^>^v^^v>>><^vv^<vv<>v<>><^<<^<<vv><<v<<>^>v^>^vvv>^<v<>^^v^>v^<^<><vv<<><>v<^><<<v<v^<v^^><<<v>>^<^>>v<v^^><>^>^v^^>v><>^><^><<><>vvv<<<>>vv>^<<<v<^>v<<>v>vv^vvv<<>^>^<<^><v^>v>v>><><<^^vv^<<<v>v<<><^<^>>^<>v<vv^^v<<<<^<<vv><^>v^<v<<<vv<^<><>><vvv<><<^><<<vvv<>^v^v>v>^<^>v>^^<v>v<<^v>><v>^vv^<^vvv<v>v^<>^vvvv<^>^^^vvv>vv<<^>^<><><^v^^>^><^<vvvvv<v<>^><^^<^^<<<<<<v>^<>^^>>><vv<>>^^v^<^<<^>><vv>^v>>v<>v>^^><v^^v^v^<^<>^v><<><^^>^>v<>>v<^^>v<>^^>v<^>>>^v>^>v>v<vvv^^^^<><v>v<v<<^>vv<>v^v<<>>>><vv^<^v^^>v^<^v<<v^v<v^^^>><<>^<<<^<>v^>^<><^<<>^^<<^>>^>v<v<v<>^<<v<^^>^<<>><v>^><v<><v>v^<<><>>vv>^<>v>vv^v<>v>^vv^><>v>>v<v^<<<v<<^>v>v<^<<v<><>^v^^>v^><>^>>^>>^v<<v><>^<v<>vv^^^<^^<<<v>>>vv<v^^vv>^^v>>v>^><>v^<^^vv^^<<>v^v<^>^<^^>^<>^>^<^^<<v>^>^>^^><v>^<^<<><>v<vvv>^v>^<<vvvvv<^>^<<<><>^^>^>>v<>v>>^<>v^<vv>^>^<><v<v>><><<>>^<v>><<^<^^<>vv^vv^>><>vv^>v^<^><>^^<^<v^<v<^^>^vv>v^vvv<>^>>^^>v^^v<>v^v>>>v><>>v>v<>v<v^v^^>^^v>><<vv^v^^v^>^v>^>v><>v>^v>^^^<v<v^<v<v^^<vvv<<<<v^>>^^^^^^^v<<^^<^v>v<^>^><^^v><^^v^^>vv^^v^<>^^>v^v<vv>>^>v>^vv<^vv>><v^<vvv<^v>v><>^<><<<vvv^vvv<<>^>^v^^<<^^<>>><<>^<<^v<^^>>><^v^<>v<<vv^<^<vv>>^<<>v<vvv<><^v><v>>>^^vv^>vv<^^<<^v^><<v>v<vv^v^<>>><v>vvv<v^^><>^<vvvv<>>^vvvv^><^<>v^<><<^^>v><<<<vvv>><^>><^>^v<^<><^^vv<<>>><>^vv^v>vv>>^<>^>v>><><^>>v^v^>>>v><<<^v>v<v^v^v^^<<vv>vv<>><v<vv><^^^^v><v>v^^^v<>v>^v<<^<>>vv<>v^<>v>vv<<<>>^<<<>v><<>>vvvvv<^><<v<<<v^>v^><>^vvv<>^>vvv>vvv<<v<^^<v^<><>^>^^>><^>vv^<v<<<vv>^^v>><v<^>^vv<^v<>v<>>>v<v<^>^><>v<>v^<v>>>><^<>>^>vv<v>^v>v^<<<v>v>^^<>v><<v^v>>^>>^>v<>^^<^^vv<>^<v>^>v>>v<<<>^>^<><<>^^>v>>v<>v><v^^^>^<v^>><><<<<vv>>v<>^<>>^^v>><<<^v^<v<<vv<<^<<>^<<><><><^><<>^>><><^<v^<^^<^v<<><^v<v><>^<^vvv><<vv^<v<v<v^>v<>vv^v^v>>v^^^<v^>>^>v<><^<>^v<>><>>vv<^<vvv^^<^^<vv^^^<vv<<v^>^^^>><v><vvv<^><^^^<<>^^vv<>>>^>>v^<v^vv>vv^<>>^<>v<<>vv^^><v<<v^>>><v^v<v^vv><<vv<<^v^><<<>v>^^v<>vv<vvv<^vv><^>vvv^^<><>^^v>^vvv<v<>>>^^v<^<>^v^^<<^<v><>^<>vv>v^<<v>><><v<v<vvv<>><^^^><<<>^><vv^>v>vvvv<<v>v^<v>>>^>^v>>><^^<>>v^<><^vv>>v>vv>>><<^>^>>^^><>^<<v^vv^vv<^v>v^<^>vv<^>><<^><vv^v^<^<><v<<^<<>>v^<<>v^<>><>vv<>v^^v^><>>v><<vv>^>v^<>>vvv^<v>v^^><>v<vv<<>>>>>^<^^^v<>>v><>>^>^^v^v<vvvvv>><v^vv<^<v<<><^^<v<>v><<v>>^>^<^><><<^^<>><^^^^vv^v>>v><>><^>^v>><<v><^>>^^<>^<^v<^^>v^^>vv<^<v<><><v><>>v>v<>v^>^<^<>>^v<<<>v>^v<v><<>>v<^>><>v>v^<<>><^^<>^>^^^<v^>v^v^v>v^<>><v>vv><^<<vv><^v>>>v<>^>^v<<<<v<v^>vv<v<><>><>><vv^v>v<<^^v^<<^<><^<^vv^^v<^<>>v<<>v<>><<>^<<^v<>>^^^^vv^>>v<v<>vv<<^>>>vvv>^>^v^<>>>vvv>^vv>vvvv^>v<v>>^<<v<<v^>v<>>>>^<vv^<<^<><>>v<^<<>v^^v<><<v><<>v<>v^<v>^^^^v^v<>>>>^>^v<>^><^<^<v<<<^<^v>^<>vv^><><<^>v>>v^<<<vv<><><<<v>^^^^^><<<><v<v>^v^vv<><^^<>v>>v><><>>v><>>^^>v^><<<vv>^^v<^^<<^vv<>v<^^<>v^<<vv^<>^^v<vv^^^^^><^^v<<^^^>>^<>>vv>>v>^v>v>^>vv<>vv^^v<v<>^<<>v<^>v^v<v><<^<<v<><v^<v<^^<<v<v>v<v><>>vv><^><v>><><^<v>>^<v<^<v>^v<>>^^vv>^<<>^v<^>^^^^><^<<^^^v>v<>>^^<>^<^^<><^v^^^<^^<>v<>>^vv>v>^<<^^v<v<><<vv>v<^<v>^v^^^<>v<v^^v>>v^^^^<<>v>^<>^>^<v>^^>><<>^<<v>>>>>^v>><<>v>v<vvvv<^><^^<v^^^^>v>v^v^v>><^^><>^<vv<<^<v^><<<>><>^^^vv^<v^<><^^v<v><vv<>vv>v<<><^^>^vv^>>vv^<<>>v^>v<><vv><>v>>>v^^vvvvv^^<<^><>v<vv^<>^^^>v^<<^v^^^v^^v^v>v><><^>v^<>><<>><v>vv<vv>^v>>>v<^>v^><>^^^vv>v>vvv^^^^v>^^^v<v^v^vv>^>vv<>v>><^<v^^v^v^>>><>>>v<<>>v<^^<<>v^v>>>^<vv>>v>v^^^^^^>^v<^^^^v>v^<<v^>vv<^v>>^<v^>^<>vv^>v<<^>^^>^v<>v<vv<v^>^^>^<vv><v^>v>>^v><>^><<v<v^<>^><^vv<^><^<>v>v<>v^vvv^v<<^v^>>v^<^^>v>>v^v>^vv^vv>^>^^>>v^^^<<<<^v><<v^><<>vv<v<>^<^>>^v^^v>^>><^>^v>v<^>^<v>^^vvv>v<<^^v^v>><v<>v>>^^>v^^vv^^>>v^><>v^<v>v>^>v^v<vv^v^>^<>^>^<><<^<^^><v<<^<^<v><vvv<v^vvvvv>^v>v<vv>>v<^v>^vv>v>><^>vvv<<>^v<^^v<<^>v<^^>^<vvv^>>^^<<vvvv><^>v^><<<^>^vvv>vvv<<>v<v<^^vv<><^^><<^<^v^^^<>><<<><>v^<v^>vv<v>>><v>v>^>^vv<^^^>v<>^vv><>><vv^>^^>>vv^><v^^<v><^<v>^>^^^^^<<^<<>v<>>v<>v<>>v^<><>^<^v<^>^<^><>^>^<<<^<^^v<^>^v><^<vv<v<^^<v>^<^v^<<<<v<v>^>>vv>>v>v><<<vvv^>^<^>^^v<>><>>v>>v>>^<^vvv^>^><>>^^^v<<>>vv^^^<>>v^^<vv^^^>v<><<^>>^<<><>v<^><v<^<^^<<>>vv^>>v<<<>^^v<vv<^<^<>>v^v<v>v>^>^^v<>><>>>>^^>>><<>^^>^<v^^<^^>vv>v^^^>><>v^^>>^><<^^v><>^v<>^>>^v>><v>><vv>vvv>^>>^><vv^v>>v>><>v<v^^v^>v^^^<>^<>>><><<<v>vv>v>vvv>^>^>v^v>^>vvv>><>v^v>>^vvv<^<^<v^v<><<>v^vv>^v<^>><>v^v^v^^^v>>^<>^<<<<>^<>^><>^^<>^v>^^<>v>^^vvv<>v<^^>^^^<>>v<v>vv><<>vv>^^v^>v^v>^<>><^^^v^<v^>^^v<^>><>vv<<<^v^><v>^><^^<><^v^v>^>>><^>v^v>^>v<^^^<v>^v<>^^>v^<>>v<>v><>>v>^<^v<>v<^^^<^<><^><<<><v>v<v<v>v<v><v^v<^^^><<v^>^><><>>>^v^v<<^^^v<^<>v^>v>^v^>^v><<^v^<^>v^<<^<>><v>>vv>>^^v><^<<>^vv>>vv><<>v>^<^><^v<<>>v<v^^<vv>>>^<><^<<>vvv<v<v<>><v^^vv>>^^><<>v<><v^^<<^<^^<<^^<v><>^>^v^v><><v<>>>v>>^>>vvv^^>>v>^>vv>>>v<<^v>v^^^v<v<<><<^>^>^v^>^vvv^<vv<^vv>>vv^^^^<^^v^<>vv<v<^>v>^^<<v^^^>vv>^^vv>v<v<<^v<vvv^<v<>>^<v<<<^v^vv^<<^v>^^<v>>^<<<<<^<<<^v<v<vv>><<<<vvv><<^>^v^>>>>v^>v>>>>v>^vv>^<<>^>v^<^^^v<<vvv<vv<><v^<^<><^<v^^>vv<>><^><<><^v>^>v^^^^v>v>>><>^v^^>v^<vv>v>>v^>><^v^>>><^vv>><v^<^<^<^v^^^^^>^v^<^>v>v<^>^>>>vv<<>^v^<v><<>>^vvv<>>vv^<v>>^<^>^^<vv>^>v^>^^<vvvv^v>>>v<>>^<vv>^v^>v^^vv^<^^>^^<>>>vv^><^>^^<>>>v><><>^<v><<^v<v>>^v><><^^v^^^^v<>^v>^^vvv<v^<<^^v<<vvv^^v^^>v<v<>^>><^v>>^><^<v<>v<^vv<^^>>><>^<<v>v^><>^><v^v^v>^><>^v^><^<><>><<>>v>>^>v<^<<>^>>^><vv^<<>v<v<<>^>vv><^<<>^v^^<>>^^v<>>>^>^>^v^v<>^>><<<<>vv<^^>^^<v^^v>><><<^>^vvv<vvv^><<<vvv^<<>^>><v>><v<v<<vv^v<v^>^<v<^>>>^vv><<v<vv<<^><v<>vvv<^v><<<>^^<<v^<^v>>^>>><^v<vv<^>v^v<^^<<^<^^><>>>v<v>v^^^vvvv^<<v^<^^^^^>v^>vvv><vv<^^v>>>^^><>>vv>^>>v<<vv^>><^^>v>v<^v<v>>^^^^v<><>^>>vv>>^v^^>v<>>>^<v^^>^>>vv^v^><v^^^>^>vv<v<^<>v>>^v<><<>^^<v^<<^>>>^>^<<>vvvvv>>vvv^v><v<>vv>>^^<>v>^<>v>v<v<v><^v><^>vv^vv>^^>><^>^^^>^^v^<<><<^<v>^^v^^<^v<v>>^<v<<^^vv^>^v<>><<^vvvv<^v^^>v<v^^v^>v^v><>^>v^^^>vv<^vvv>>^v<><><<>^<<vvv>^>^<<v>>>>>>v<>v>v>v><^<>^v>v>><vv<v>^v><><vvv>>v<^<><vv^<>><^^vv>v<^^v<^>^<<>^^>v>>^>vv^v>v>^^^<v>v<>^><<v>><v>v^^>v<^<>vvv><>^<^><v^<>>^<v<<v<v^><vv<^<><v^>>><^^<v^^<v<>v>>v^>>><>><<^^v>>v<v<^<^>><^<><v^^v>><><<^v<v<>vv^v^vv><^vvvvv^v<v^>>^>>>^<<><^v^>><<vvvv<><<<<>^v^>>>><^<>>v^<v<v>vv<>^^>>vv>v^vv<vv>v<^v>^<v<><v<<>^>v>>>>>v<>v>>^vv^vv<>><>v<vv<^>^vv>v<v><<v<>v^<^<<<>^>^>^^>^<>>vv>><<v<vv>>v<v<<v^<<<<^vv^v><>^v>>v>>^<v<>><<<^<^^<v^^><^^<<v<>>^>^^^^<v<vv<>^>>v>vv>^^^vv^<v<^v<<v<^^>>^>^<^^^<><v<>^^>^^<<^^>vv<<>^>>v<<<v<^>^<<^vv>v>^v>><v<<>vvv<<<v^<v>>v<><><v^<^<^v^v<^<^v<><vv><^<^^v>>v<<><>>v><^>>>v<><^<^>v<>v<^vv^^^^^>^>v<v<v<v<<v><^<<v<><><^>>v<<<<v<v^>>vvv^^^<vv<>^<v<^<^^>v^vvv^^<v>>>v^<><v<>v<v><^^<>v<^v<<v>><>><^>^<vv^v<^<v<<^>^>^><^<^<<>^^<<><^vv<<<^^<>>^^^^<v<<vv><vv<v^<v^>>^v<v>^v<>^^^v<^<^<^v^>><<^vv>v>v^^>>v>^>v<<<^^>>^><^>vv><>v<v<^<v>><<^><><v<^><vv>v>^v<^^<^>^>>v<v>v<v^>^>v>v^>^v<><v<^>^<v^><^>v>^<^^vvv^^>v^>v^vv<v<v^>>v^>>>^^>v^^><<>^>vv<^^vvvvv^v>^>^^vv<<<><vv>v><<^>>^v>>vv^v<<<v<^^v>^<vv>><v>^v^^>v<><>><vv<v^<v^^<^^><>v>^>><^^<vvv><<>v^<<^v<<><v<<>>^<vvv^^>>v^>><^>>v>vv<<<>>^^^<<>v^<vv><<<<>^<vv<v<><^<v><>^v>>^<vv<^^v>>^v<v^<^^^>v<^<v^>>vv^^v>^<vv><v<^>><^vv^^><^v>^v^<^^<^^<^vvv<^vv><<v>v>^<<^><>v<vvv^v>><<<><v^v<<^>vvv^v^^><<<>^^<<vv^v^v^>v<>^^^<^>v^v<<^v^<v^v^><><^^<<>^^v<><>v<v^<>><>^<^vv><>>v><<>v>>^vv<v^<<<<>>vv^^<<>>^v^<v^><<v<>^<^>^v<v^<>^>>^>^<<vv>>v<v^><>v<<^^<<<v>>><<<^>^^v^<vv^><><>vvvv>vv^v><><^^<<vv>vv<>v>v<>>v>>v>v<vvvvv^<^><^<v>v^<v><^v^^><^><<^vvv<v<>^<^v^>^v^>v<>vvvv><><<v>v<vv>>^^<^vv>^>^<^<^<^v>^>v>>v^<^^^^><<>>>v>>><^^>^<>^v^<^>>^v^><v<v>v<^v^^vv>v<^^v>><>^<<>>>^<<v<><>v<v^<>vvv>>^v<v>v^<<^vvv^^^^>v^>^v<<v>^v^^<v<<^>^^>^v>vv<v><<v^^vv>>^<^v^v^^v<>^vvv>vv><vvv^<vv>v>^>>vv<v<v^>v>v^>v><><<^<v^^<<v<^^v>>><><>^v<<^^>>v^^v>v<>><^>v^v^>^vv>>^^>v<>^v<>^^v<><<^^<>^<v^^v>>v<v>vv<^><<<^v<vv^>><v^<vvv^>>>v<^<^v<><v><v^<vvv>>v><v<vv>>v><^<^v>^<><^<<^<v^v>^vvv^^<>^><vvvv^>v<^^<v>>^vvvvv^>vvv<<>><<vv>>>v<^<v<>^v<><<<^^><^<<v<v^<>v^v>vvv>^<v>^v>^^^^<vv^>vv>^><>>>>>><^<<<><^v>v>v<^><<^<^^v<<>>><^><<^v^^>^v<<>>^>v^v>vvv<<^<<^^^vv^>vvv>^^<>^^^>^<^>v^<<>v>>^>v<<<<^<v>v^vvv>>><>><>v^v>^<>^v>v^<vv>v>vvv<vv><<>><^v>v><v^<v>^<v>vv>vvvv^<>><^^v<^>><v<^^>v<v>v^><<<<^<<v^^<v>v<<v^><<>>^>^<>>^^>^<>vv<>vvv^^<vvv<v>>v<><>v<^^>^^>>><>^>v^>>^v<<><^<><v<<><>>^v>vvv>>^<>^v^<<<^<><v<^<>^<^<^v><>vv>>v<^vv><^v^<^<v<^>^>^^v>^v>>v><>>><<<<>>v^v^^^v^>vv^<>><^<>^v<v^<<<>^vv>>^v>^v<^^v<v>v>^>^>^<><<<^<>><><<^<<><<<vv<<v^^<^>v>><vv<>v^^<v><><v^vv><vv<^>v<v^vv^<><^vvvv<>^^<<^v^>><<<v>>vvvv^<^>>>v<<<<>v<<>>vvv><v^^<><<vv<vv><^<<<>vv^>v<v>^^><<v>vv<<>><>^>>^^>^<^v>v<^v><v^v><<v>v^^v^v^<>v^v>>v<<vv><v^^>^^>>v<>v>^<v^v<^^<^^^^^v>v>v>v><^>>>v^v^v><<^>>v^>^^^v<v^<<^v^><^<v^>>>v><>v^vvv><<vv<^^vv^>v^>>vv<^^<^^<<><<>^v<><^v><>v^>^^v>v>>^><>^vv<><<vv^<><<>>vv><^<<vv><<<<^v<^^^^><>>^v<v<^^<v>^^>v^>^vv><>^vv><<v<vv>><^>^<<>>^>>^v^^v^<>v^>v>><v><<<>>>v^><>>^v^>>^^^<v<^<vv>v>^^^v^<<v<<<>^<><><^<>^>v<>v<^>v><^>^>>^>^^<v<<v>v<>^vv<v<>v<><<>>v^<^v^^v<^><^^^>>^>><v<>v^<<<v><^>>^v>^>>v<<^><<^^>><>v^>v^^<<^>vv><>^^v^vv^^<v><^<^<^v<>v<>v^v<<v^^^>^<>><vv<^^<^vv>^<<v>>>>^<<vvvv>^v>vv^<^><<<^^>^><><vv^>>v<<<>vv<>v>v<<<^^>v>v><^>>>>v<><<vv>>v>><<^v<><<>>>vvv^<^vv>>>>>^<<^>^<<>>v^<vv<vv^>^v<<^>>v>vvvv<<^><<>^^>^<^>>vv^^^>>vv^vv^<<^^<^^vv^v><>^vv>><<v^^>v>>>v^<<<^^><<^>>vv>>>^^><<<>><^v<v<v^<v^^><^vv<v^v^vvvv>v^>>v>>^>^^>v>v<<<>>^^v>>>^>><>^^v<<<^><v^<>vv^vv^^>v^^>v^v^^>>><<>^<^^<<^v^^^>v><^^^v><v>>^>><v>><v<v<^>vv>v<^v^>^^^^>^^>^^v<v<<<>>>>>>v^v>vv<v^>>><>^v>v^vvv<^><>v^>^v^^v>v<<v>^>>^v<^>vv^v>^><^v>^^<><><v>v>^^vv^>^^<^<^v^<>vv><^<^vv>^^^>^v>>^vv>^<>v>>v^^^>>v^><v><^v<>><vv>>><<vv^>><v^<>vv^v^v^v>>v<<<<<^>^^>v<<^>^<^<^><>v<v<<^v^^<^><><>^><vvvv^>v^v^><<^^<><><v<<vvv<^<<>>v<^>v><^^^vvv^<^>^<<<v<^v<><^<<^>^>>^vvv>v<^>v^<v>v<v<<><<v>^^>><^><<^^<<<^vv>^vv<vv>^vv>v^<<>v^>v>vvv>^v^><<>>v^^<<<<^^><>v^v>^v>v>v>>v<<^>^^><v>>^^<><^<vvv><<vvvv^v^^>^<v<<<vvv>v>v<<v^>^<>>vvv^^<v^vvvvv>>v>^>vv<v^>>^^>>v><v^v><<^^^v^><<<v^v^<>>>^^^<vv<vv><>v^>^>><^v^v<>>>^v<><>>^>^>>^^v<>>v><vv^^^v^><<^>v><^v^^^<^><^><v<>^>^v><v<vvv><^^><><>><^<v<<v<>v<v^^<<v^<<>^>vv^<<vv<^<<<<<^><<vv^<<>^v>^>>^^>>>>vv>><^^><<<^v<^v<<^>^<v<>v>v>v>^^<>v>>v<^^^>>v^^>>v^vv^>vv^><<^vvv^<>^>v^><^^vv>v><>>^v^>v<>><v>^<<^^><^<>v<>^vv>>^<^^><^><><>><v>>>^v>v<^vvvv^>^<><^^^<v<>>v^<v<^><v^^<v><>>^^^^v>>><^v^>v^^>><v>^<<>^^^><<vv>^>>>vv>>><><<>^>>>vvv<<<><>>^>v<>vv><>^^^>vv^<><>>^^^>vv<v^<vvv^vv<^>^v><<^v<v^v^<^";
//	static String inputs = 
//			  "<vv>^<v^>v>^vv^v>v<>v^v<v<^vv<<<^><<><>>v<vvv<>^v^>^<<<><<v<<<v^vv^v>^"
//			+ "vvv<<^>^v^^><<>>><>^<<><^vv^^<>vvv<>><^^v>^>vv<>v<<<<v<^v>^<^^>>>^<v<v"
//			+ "><>vv>v^v^<>><>>>><^^>vv>v<^^^>>v^v^<^^>v^^>v^<^v>v<>>v^v^<v>v^^<^^vv<"
//			+ "<<v<^>>^^^^>>>v^<>vvv^><v<<<>^^^vv^<vvv>^>v<^^^^v<>^>vvvv><>>v^<<^^^^^"
//			+ "^><^><>>><>^^<<^^v>>><^<v>^<vv>>v>>>^v><>^v><<<<v>>v<v<v>vvv>^<><<>^><"
//			+ "^>><>^v<><^vvv<^^<><v<<<<<><^v<<<><<<^^<v<^^^><^>>^<v^><<<^>>^v<v^v<v^"
//			+ ">^>>^v>vv>^<<^v<>><<><<v<<v><>v<^vv<<<>^^v^>^^>>><<^v>>v^v><^^>>^<>vv^"
//			+ "<><^^>^^^<><vvvvv^v<v<<>^v<v>v<<^><<><<><<<^^<<<^<<>><<><^^^>^^<>^>v<>"
//			+ "^^>vv<^v^v<vv>^<><v<^v>^^^>>>^^vvv^>vvv<>>>^<^>>>>>^<<^v>^vvv<>^<><<v>"
//			+ "v^^>>><<^^<>>^v^<v^vv<>v^<<>^<^v^v><^<<<><<^<v><v<>vv>>v><v^<vv<>v^<<^";
	//static String line = "##################################################";
	static String line = "####################################################################################################";
	//static String line = "####################";

	static int len = line.length();
	static String key = "-1,-1";

	static HashMap<String, String> mainMap = new HashMap<String, String>();
	public static void main(String[] args) {

		for(int i =0; i < len/2; i++) {
			for(int j=0;j<len;j++) {
				mainMap.put(j+","+i,""+map.charAt(i*len+j));
				if(map.charAt(i*len+j) == '@') {
					key = j+","+i;
				}
			}
		}
		for(int q = 0; q < len/2; q++) {
			for(int r = 0; r < len; r++) {
				System.out.print(mainMap.get(r+","+q));
			}
			System.out.println();
		}
		for(int i = 0; i < inputs.length(); i++) {
			//System.out.println(inputs.charAt(i)+" :");
			try {
				mainMap = moveBlock(key, mainMap, inputs.charAt(i), false);
			}
			catch (Exception e) {
				//System.out.println("err");
			}
			//key = mainMap.
			for(int q = 0; q < len/2; q++) {
				for(int r = 0; r < len; r++) {
					//System.out.print(mainMap.get(r+","+q));
					if(mainMap.get(r+","+q).equals("[") && !(mainMap.get((r+1)+","+q).equals("}"))) {
						//System.out.println();
						mainMap.put((r+1)+","+q, "]");
					}
					else if(mainMap.get(r+","+q).equals("]") && !(mainMap.get((r-1)+","+q).equals("["))) {
						mainMap.put((r-1)+","+q, "[");
					}
				}
				//System.out.println();
			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			if((((i+0.0)/inputs.length()*100)%1) == 0) {
				System.out.println(((i+0.0)/inputs.length()*100)+ "% through inputs");
			}
		}
		
		for(int q = 0; q < len/2; q++) {
			for(int r = 0; r < len; r++) {
				System.out.print(mainMap.get(r+","+q));
			}
			System.out.println();
		}
		
		long sum = 0;
		for(String i : mainMap.keySet()) {
			if(mainMap.get(i).equals("[")) {
				int[] temp = Util.Strings.strToIntarr(i);
				sum += 100*temp[1]+temp[0];
			}
		}
		System.out.println(sum);
	}
	
	@SuppressWarnings("null")
	public static HashMap<String,String> moveBlock(String tempkey, HashMap<String,String> inputmap, char inputChar, boolean flag) throws Exception {
		int[] coords = Util.Strings.strToIntarr(tempkey);
		@SuppressWarnings("unchecked")
		HashMap<String,String> tempMap = (HashMap<String, String>) inputmap.clone();
		if(!flag) {
			//System.out.println(flag);
			if(inputChar == '^' || inputChar == 'v') {
				if(inputmap.get(tempkey).equals("[")) {
					//tempMap.put(tempkey, "O");
					tempMap = moveBlock(coords[0]+1+","+coords[1], tempMap, inputChar, true);
				}
				if(inputmap.get(tempkey).equals("]")) {
					//tempMap.put(tempkey, "O");
					tempMap = moveBlock(coords[0]-1+","+coords[1], tempMap, inputChar, true);
				}
			}
		}
		switch(inputChar) {
		case '^':
			coords[1]-=1;
			break;
		case 'v':
			coords[1]+=1;
			break;
		case '>':
			coords[0]+=1;
			break;
		case '<':
			coords[0]-=1;
			break;
		}
		if(!inputmap.get(coords[0]+","+coords[1]).equals(".")) {
			//System.out.println("iter");
			if(inputmap.get(coords[0]+","+coords[1]).equals("#")) {
				Exception e = null;
				//System.out.println("err");
				throw e;
			}
			if((inputChar == 'v') && (tempMap.get(tempkey).equals(tempMap.get(coords[0]+","+coords[1]))) && flag) {
				
			}
			else if((inputChar == '^') && (tempMap.get(tempkey).equals(tempMap.get(coords[0]+","+coords[1]))) && flag) {
				
			}
			else {
				tempMap = moveBlock(coords[0]+","+coords[1], tempMap, inputChar, false);
			}
		}
		tempMap.put(coords[0]+","+coords[1], inputmap.get(tempkey));
		tempMap.put(tempkey, ".");
		if(tempMap.get(coords[0]+","+coords[1]).equals("@")) {
			key = coords[0]+","+coords[1];
		}
		return tempMap;
	}
}
