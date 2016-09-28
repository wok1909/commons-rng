/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rng.internal.source32;

import org.junit.Assert;
import org.junit.Test;

public class Well44497aTest {
    @Test
    public void testReferenceCode() {
        final int[] base = {
            740849862,  1202665156,  -199039369,  -259008301,  -291878969, -1164428990, -1565918811,   491009864,
            -1883086670,  1383450241,  1244617256,   689006653, -1576746370, -1307940314,  1421489086,  1742094000,
            -595495729,  1047766204,  1875773301, -1637793284,  1379017098,   262792705,   191880010,  -251000180,
            -1753047622,  -972355720,    90626881,  1644693418,  1503365577,   439653419,  1806361562,  1268823869
        };
        final int[] init = new int[1391];
        for (int i = 0; i < init.length; ++i) {
            init[i] = base[i % base.length] + i;
        }

        final Well44497a rng = new Well44497a(init);

        final int[] refInt = {
            -1464956854,  -1524360321,    986845646,   -182050548,   -818943186,  -1744848370,   1392434650,   -182648505,  -2026593838,   1254866610,   -410459761,  -1392048371,   -968730026,   1485793687,   -728749746,   -112685463,
            275126404,  -1101838984,   1193096287,    443511615,   -510869213,    549869992,   1974458428,  -1217587840,   -335835016,  -2048974745,   1066947099,   -611611187,   1978925459,    688164478,   -463344808,     56995910,
            699288809,    606392470,    117418673,   1948706703,   -485598135,    385841705,   1725261146,   -919553921,     70643668,   2128611684,   1720197347,    738706713,   1162026860,   -611442152,   1469145601,   2051653750,
            609067755,  -1971782890,   -971114565,    776260144,   1619791127,  -1547233838,   1502505722,    913168193,   1761269649,     81782996,     62251540,   1519079156,   1239007000,    489633356,   -800433470,  -2107278046,
            495320431,    269446836,  -2013306553,   1074614697,   1645125348,    584369930,   -405429577,   1211134012,  -2060113546,     -2047824,   -443978800,    271218497,  -1002185964,   1519315874,   -695096464,    -79101601,
            -1521653608,    192426133,   1159511202,  -1354494985,   -477280535,    583522228,   -661741458,  -1251175621,   -369487281,  -2015449518,  -2102058930,   -645264919,   -925270025,  -1674575999,   1363844609,   -831732660,
            -1668989157,  -1861246633,     83763283,  -1056074975,   -519054258,  -1546386261,   1691674654,   -885968657,  -1189571815,   2095154843,   1686743191,  -1859471265,   -261593938,   1721982136,   -491120252,   -949699153,
            642525852,  -2005306625,  -1004765905,    742736856,   1653443876,    788423835,   1536155740,    879514143,  -1510757104,    115238646,     28600662,   1485490803,   1272460710,    523153480,   -766782926,   1332478031,
            528775440,    302965264,  -2046891123,   1108139271,   1611601128,    550846467,   -439082190,   1244786747,    941120547,    -35568474,   1756370964,    304870369,   1902684028,   -408710726,   1673189520,   1180987663,
            -1488131864,    158973303,    154514890,  -1387953397,   1453732833,  -1342263302,   -628153633,      4710424,    619931109,    721411332,  -2135645486,   1688696681,   -891749588,  -1641122924,   1397432310,   -865254619,
            -1635468227,  -1827787970,  -1311416657,  -1022618057,   1411688086,  -1579840139,   -637954674,   2115653281,  -1155985079,  -1043532593,   -374286955,  -1825883832,   -227940643,   1688394137,   -524577925,   -983222470,
            -1955769926,    626525757,  -2009760930,  -1855453635,   -676923169,    754966926,   -291202391,  -2126042921,  -1477304277,  -1409345382,  -1264640578,   -441993991,    -17611930,  -1576809974,   2137694350,   1299022733,
            -762509116,  -1087399293,    819303572,    -14571174,   -719035481,  -1644675278,   1492736905,    -15038081,    974773023,   1087127339,   1790024863,  -1493135734,   1936273291,   -442361741,   1639666948,   1147532756,
            174955156,  -1537685747,    187972574,    275303083,   1420277149,  -1375787574,   1873043153,     38164241,    653451946,    687758113,    899667071,   1722219976,   2146668333,    587401069,    -26582672,   2034645447,
            1401801794,   1043291001,  -1277898614,   2116116828,   1445274301,    150534325,    469242183,   -937704471,    171074779,   -204638071,   1269913689,   -771734064,    -12280461,  -1182158859,   1704390140,   -263303749,
            -848503723,  -1822849148,   -634064465,   1130988864,  -1515750310,   -908815400,   1487214333,    994482967,    853103628,   1711185413,   1520342001,   1067859186,   1693632130,   -603831333,    292236742,   -800655385,
            -1467184928,    221125007,  -1697377800,   1293953144,   1730537111,   1073329737,    519625212,    689636032,   1127394154,  -1496469136,  -1214585810,    822152197,  -1572579275,   -527866383,   -996792678,  -2058452887,
            -1133767559,    576275042,   1579109209,   -295089371,   1502267384,   -724281876,   -911879875,   1131096177,    333026744,   1238706603,   1067340063,   -745697708,   -973992204,   1560446744,   -664017057,   -616056490,
            1099714049,    674159948,    383625825,   1411443110,   1862818263,  -1896254899,   1322476914,   -719144734,  -1540101945,    988154902,    781856577,   2013381051,  -2059071359,   -142073207,     60252832,   2052050421,
            -666391497,    376633738,   1663011481,  -1706886481,  -1870003191,   1003819645,    898131216,    778824906,   -656875645,  -1730811011,  -1751653787,   2056079904,    231977636,   1831419220,   -465545074,  -1505266471,
            1034419975,   -133864043,   1876779821,   1879792902,   -100100435,   -959264741,   -472668436,    203584096,    -46980157,  -1478047098,   -979669209,    809008494,   1279644171,   2055793632,   1385672419,  -1756428826,
            -1790481031,  -2089665073,  -1608595011,    457322987,   1267418945,    -19541848,   -796352273,  -1049973752,     30940894,   -539710199,  -1097391703,   -779353550,  -1328320498,   -735447662,   -918513196,   1516945649,
            1218919237,   -251287485,   1826366637,    353082340,    889839220,    399638904,  -1462573609,   -618450466,   1429903706,   2095548034,   1486594475,  -1053248922,     74346322,   -357998703,   1790710495,   -146359619,
            1581657509,   -797737661,   -920778913,    608399665,    646679359,   1861775150,  -1014371223,    476735306,  -1577737028,    383018939,   1234592859,    344770283,   -472763155,    187217985,   1245828866,   1936329359,
            61243025,  -1979390025,    903671173,    302699505,  -1677126111,  -1194113496,    835857595,    706998946,     70931462,   1374113464,  -1464459699,   -231081598,   1366205112,    396990527,  -1615015619,   -968458597,
            457632575,     24361353,  -1120685182,   2101590608,   1654666456,  -1208442054,    579414359,   1078056578,    217408674,  -1560683025,    815178420,   1219326466,    450032327,    774403237,     54597342,   -664057229,
            447132403,     50603973,    435640301,  -1224073863,  -1339908037,   1775470944,  -1378119263,  -1375189988,  -1287971162,     29816317,  -1313418882,  -1824967031,    443540716,     11064217,  -1463969487,   1967601549,
            124474667,   1230898256,  -1741455555,    561643750,    933295231,   -923145874,    245538199,    289478386,    200552280,   -268887021,  -1598221376,   1236123270,    318325803,    773964550,    191670680,    158043961,
            -762639146,   -416703928,   -721969492,   1664330785,   -584949010,   1509045840,  -2066001147,   1728613092,  -1103375821,  -1262079070,  -2034789427,   -418216342,   -546365126,   1235751589,   1639799329,   2085089663,
            -697590049,  -2007054256,   -147701903,    209371702,  -1868450893,   1241065116,   1537364837,  -1035970557,    318040217,    150492098,   1841159805,   -491979749,  -1275490577,  -1759443566,   -697538216,  -1589624976,
            -678703557,   -189067001,   1539472677,  -1396089831,    271512148,    180483983,    483714313,    703861378,   2122114992,   -600097045,    522009268,    160429181,   -744428886,   1541223403,  -1211039718,  -1167643980,
            1551471162,   -816207368,  -1429258613,   1350901561,   1934120609,   -961643277,   -214772286,  -2128270227,  -1561239720,   1493926966,   1376671007,     94966082,    221846150,   -164351411,    -51309876,    497148497,
            1233668542,    266257753,   -773473851,    953946385,    420815294,  -1390653175,   1834391782,      4704447,   -891751440,   -744104272,  -1082756642,   1431640408,  -1912055536,   -159789461,   -704946016,   1956368139,
            642279822,   -374415338,   1562655802,   -272964020,   1071498305,    667364168,  -1546405154,    341389690,   1360662999,    377696332,   -437020076,  -1668574556,   1242655350,   -756555890,    645954261,   1914624235,
            2134904445,   -247737098,    143667521,    -17668806,   1804148531,    414247300,   1030053929,  -1595215075,    887532426,    553113691,   1173830167,   -303724353,   -280418143,  -1143962122,  -1898518451,     36464746,
            1189572700,  -1549967582,   1093341440,   -452303819,   -731023001,   1111173883,   1678013973,   -836458212,   -842956392,    212774049,   -845621791,    966282353,   -823130040,    700410571,    619075141,   -304785045,
            -1816233676,  -1789653997,   -166914694,    690663021,   -669570330,   1098624444,   -987380984,    452844935,  -1089825546,   1221160503,   1217375341,    512281644,  -1106887134,   1665404458,  -1462594714,   -207498587,
            -789271490,   -723469709,    512055365,   1445951882,   1692473633,   -996873493,   1445046730,    993087194,  -1666188562,   -897427329,   1008869698,   1236029718,   1499207233,   1704947182,  -1815799281,    686399988,
            -475436580,   1588892458,    884859588,   -471913926,   -487416631,   1323960741,  -1257612174,   -468909314,  -1866654496,  -1417895838,   1707647971,    997140465,  -1358794225,   1929422460,   -605622778,  -1587468566,
            469149623,   1121515927,    748484204,   1201983830,  -1906623591,     76398473,    261109068,   -796025669,  -1964466661,   1739898262,   -756850622,   1581369453,   1484675811,    484136467,   -705983890,  -1357931714,
            548520423,    741992908,   1017931838,  -2078503520,   2097871343,    569233897,    -91903627,   1864053450,   -876129714,    336670307,  -1950420274,   -872316480,   -662220291,    275724295,    703565412,   1334248646,
            -217559198,   1044090753,    743502488,  -1518545318,     20614180,   -768582053,    976522354,    -25129962,   -983639284,     71722595,   -119236393,    368844119,   -795808244,    696073964,   1379765302,    235083623,
            666280330,  -1313689346,   -643870520,    534522699,   -250414377,  -1239276164,    159264592,  -1119503518,   1168161619,  -1366518946,  -1335653301,    248092140,   1390152547,   2051602724,  -1023547981,  -1479782621,
            -1785785862,   1609789158,   -919124123,   1703200068,   -852553456,   1573706142,   -376011685,    305068766,  -1231775451,  -1536883494,   -125122369,   -896696968,    852651567,   -458154391,    747781704,   1173040469,
            -1569200836,    312506093,  -1680530410,    117086271,    794587661,  -1231003908,  -1048955503,   2119305423,   1636729108,   -522378372,   1627421730,    545077470,  -1683264872,   1486496559,  -1793064672,   1908368749,
            -1226052295,   1399248776,   -588193954,  -1289386125,    534647065,   2126245059,   -238362987,  -1244573058,  -1571832269,  -2052693379,   1494767731,   -528668449,   -980826491,   -151282847,  -1468523556,   1876349941,
            -301654558,   1467960576,   -741720848,   -612158589,     92376910,    987915105,   1037689578,    793773489,  -1387669541,    349490139,    564784004,  -1161242130,    619703053,   2063233129,    190888106,     81845991,
            -1482466066,    283234313,    114355492,  -1879406787,  -1283370924,  -1378903370,   -730141747,   1570738286,   -281348873,   2131743196,    795654462,   -497365688,    437612465,   1928618254,   1433118279,  -1801292119,
            -2059248836,   -221673230,    163637697,   -411319468,    244353317,    786753178,    489172932,    464627154,   1258915212,   -229028334,   -994675463,   1931657329,   1784181437,    -97111947,   1728952452,  -1329133577,
            -1606156362,   1341196121,   1679632329,   -796545286,  -1021125869,   1427825468,   -214986389,    250791528,   1029777000,     90661677,    602529506,   2068040879,   1483801763,      2332097,   -457467017,    672399614,
            1542769193,   1781253216,  -1967165705,  -2052227925,  -1248173215,  -1676554121,    292413596,    209649573,   1750689340,   1946874730,   -832845570,   1774178655,   -450175610,   -431901779,    613330756,   1969434259,
            1251099237,  -1320908513,    -50659188,    273178515,   -296290724,   1195998469,   1329813722,    759419114,   1003396150,   -274557619,   -548886303,  -2055397788,   -766678640,   -464045978,  -1835907569,   -169406709,
            820751456,   1778613303,  -1582073956,  -1728391771,  -2075389498,  -1606584632,  -1702107251,    -15724560,     45610235,  -1967510298,   -671487775,  -1841110041,   -913365944,    869680052,   -798103472,  -1564096927,
            -918899909,   -810066882,    428829752,  -1413487973,   -844240890,   1343914280,   -689285374,   1827745702,   -799686631,   1696465705,   -726159000,  -1381157526,   1649221296,   1791106481,  -1872852642,   -485685063,
            1534949133,  -1611901907,   -581776031,    242740701,   -382394666,    668419384,    388297992,    748818886,    713804061,  -1783774172,  -1823401590,  -1009098384,   2071462929,   1154475522,   1309810666,  -1734475040,
            1212095416,    988288210,  -1457428115,   1699730041,  -1804729443,  -1922824494,   1000076038,   -226555981,    131425181,  -1071582828,    357680377,   1574190179,    996651958,    965704429,    -47651768,    243931978,
            808955117,   -652323633,    544967309,  -1199510217,    702795379,    997685748,   1593927308,   2119371055,   1451401230,    -41992913,   2033816081,  -1030495962,   1764010175,    457470691,  -2001190141,   -373358035,
            -1950331268,  -1291674220,    642934467,  -1825725718,  -1555687487,   1664472129,    -24722338,   1899539596,     78519318,   1662555805,   1744711308,  -2142888582,  -1597853572,    118030659,   1596713428,    404304267,
            -1350880388,    648702031,   1185458591,   1798138033,    819516445,  -1466759682,   -751277607,   -879817426,  -1931050435,   1465603177,  -1402344216,    768491239,  -1404853657,  -1915685264,  -1845859847,    313163207,
            1239598382,   1988767047,   -555152530,  -1925665864,   -182399255,  -1392390808,     64861291,   -511875035,   1879964459,    918905020,   -840773616,    459610189,  -1522352470,  -1821396360,    977274705,    -60616465,
            -1846727880,   1208592937,   -515359427,   1127607806,   -395032287,    491869604,   2053794084,    568321750,   1597027438,   1355613070,  -2069482724,   1899252555,    844726247,   -625112193,   1146099491,  -1037855139,
            1203928737,   1875686061,    994108281,   1471873396,   2026801570,      4941446,  -1066074241,   -983738686,   2037429697,   -836521112,   -633388883,   1221918725,   2137035208,   -369891832,    372509548,   -110916409,
            80517712,   -658056946,    727893428,  -1353651002,   -475459562,   -291323023,   1059377566,    591801919,   1018232602,   -348255729,   1863827426,    246032476,  -1026132864,  -1356383176,  -1224690998,    262442981,
            1257773681,  -1738604660,     77131430,  -1320261233,     -2342727,  -1817187590,  -1883997191,   1367221809,  -1863623746,  -1132606249,    149024763,  -1228275128,   -578030399,    356914163,   2109691820,   -880313621
        };

        for (int i : refInt) {
            Assert.assertEquals(i, rng.nextInt());
        }
    }
}
