package com.example.taulaperiodica;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    static final String solid = "solid";
    static  final String liquid = "liquid";
    static  final String Gasos = "gasos";
    static   final String Sintetics = "sintetics";
    static  final String MetallTrans = "Metall_Transicio";
    static  final String metallAlc = "Metall_Alcalins";
    static  final String alcalinoterris = "Alcalinoterris";
    static  final String lantanids = "Lantanids";
    static  final String actinidis = "Actinidis";
    static  final String metallsBlocP = "Metalls_bloc_p";
    static  final String Metaloidess = "Metaloides";
    static  final String noMetalls = "No_metalls";
    static  final String halogens = "Halogens";
    static  final String gasNoble = "Gasos_nobles";

    ImageView opcioJoc;

    public static elements[] elements = new elements[]{
            new elements(actinidis, solid, "Ac", "89", "Actinio", "10.070", "https://es.wikipedia.org/wiki/Actinio"),
            new elements(metallsBlocP, solid, "Al", "13", "Aluminio", "26,9815", "https://es.wikipedia.org/wiki/Aluminio"),
            new elements(actinidis, solid, "Am", "95", "Americio", "243", "https://es.wikipedia.org/wiki/Americio"),
            new elements(Metaloidess, solid, "Sb", "51", "Antimonio", "121,76", "https://es.wikipedia.org/wiki/Antimonio"),
            new elements(gasNoble, Gasos, "Ar", "18", "Argón", "39,948", "https://es.wikipedia.org/wiki/Arg%C3%B3n"),
            new elements(Metaloidess, solid, "As", "33", "Arsénico", "74,922", "https://es.wikipedia.org/wiki/Ars%C3%A9nico"),
            new elements(halogens, solid, "At", "85", "Astato", "210", "https://es.wikipedia.org/wiki/%C3%81stato"),
            new elements(noMetalls, solid, "S", "16", "Azufre", "32,064", "https://es.wikipedia.org/wiki/Azufre"),
            new elements(alcalinoterris, solid, "Ba", "56", "Bario", "137,34", "https://es.wikipedia.org/wiki/Bario"),
            new elements(alcalinoterris, solid, "Be", "4", "Berilio", "9,0122", "https://es.wikipedia.org/wiki/Berilio"),
            new elements(actinidis, solid, "Bk", "97", "Berkelio", "247", "https://es.wikipedia.org/wiki/Berkelio"),
            new elements(metallsBlocP, solid, "Bi", "83", "Bismuto", "208,980", "https://es.wikipedia.org/wiki/Bismuto"),
            new elements(MetallTrans, solid, "Bh", "107", "Bohrio", "262", "https://es.wikipedia.org/wiki/Bohrio"),
            new elements(Metaloidess, solid, "B", "5", "Boro", "10,811", "https://es.wikipedia.org/wiki/Boro"),
            new elements(noMetalls, liquid, "Br", "35", "Bromo", "79.909", "https://es.wikipedia.org/wiki/Bromo"),
            new elements(MetallTrans, solid, "Cd", "48", "Cadmio", "112,40", "https://es.wikipedia.org/wiki/Cadmio"),
            new elements(alcalinoterris, solid, "Ca", "20", "Calcio", "40,08", "https://es.wikipedia.org/wiki/Calcio"),
            new elements(actinidis, solid, "Cf", "98", "Californio", "251", "https://es.wikipedia.org/wiki/Californio"),
            new elements(noMetalls, solid, "C", "6", "Carbono", "12,01115", "https://es.wikipedia.org/wiki/Carbono"),
            new elements(lantanids, solid, "Ce", "58", "Cerio", "140,12", "https://es.wikipedia.org/wiki/Cerio"),
            new elements(alcalinoterris, solid, "Cs", "55", "Cesio", "132,905", "https://es.wikipedia.org/wiki/Cesio"),
            new elements(halogens, Gasos, "Cl", "17", "Cloro", "35,453", "https://es.wikipedia.org/wiki/Cloro"),
            new elements(MetallTrans, solid, "Co", "27", "Cobalto", "58,93", "https://es.wikipedia.org/wiki/Cobalto"),
            new elements(MetallTrans, solid, "Cu", "29", "Cobre", "63,54", "https://es.wikipedia.org/wiki/Cobre"),
            new elements(MetallTrans, solid, "Cn", "112", "Copernicio", "285", "https://es.wikipedia.org/wiki/Copernicio"),
            new elements(MetallTrans, solid, "Cr", "24", "Cromo", "51,9962", "https://es.wikipedia.org/wiki/Cromo"),
            new elements(actinidis, Sintetics, "Cm", "96", "Curio", "247", "https://es.wikipedia.org/wiki/Curio"),
            new elements(MetallTrans, Sintetics, "Ds", "110", "Darmstadio", "271", "https://es.wikipedia.org/wiki/Darmstadio"),
            new elements(lantanids, solid, "Dy", "66", "Disprosio", "162,500", "https://es.wikipedia.org/wiki/Disprosio"),
            new elements(MetallTrans, Sintetics, "Db", "105", "Dubnio", "264", "https://es.wikipedia.org/wiki/Dubnio"),
            new elements(actinidis, Sintetics, "Es", "99", "Einstenio", "252", "https://es.wikipedia.org/wiki/Einstenio"),
            new elements(lantanids, solid, "Er", "68", "Erbio", "167,259", "https://es.wikipedia.org/wiki/Erbio"),
            new elements(MetallTrans, solid, "Sc", "21", "Escandio", "44,95591", "https://es.wikipedia.org/wiki/Escandio"),
            new elements(metallsBlocP, solid, "Sn", "50", "Estaño", "118,710", "https://es.wikipedia.org/wiki/Estaño"),
            new elements(alcalinoterris, solid, "Sr", "38", "Estroncio", "87,62", "https://es.wikipedia.org/wiki/Estroncio"),
            new elements(lantanids, solid, "Eu", "63", "Europio", "151,964", "https://es.wikipedia.org/wiki/Europio"),
            new elements(actinidis, Sintetics, "Fm", "100", "Fermio", "257", "https://es.wikipedia.org/wiki/Fermio"),
            new elements(metallsBlocP, Sintetics, "FI", "114", "Flerovium", "289", "https://es.wikipedia.org/wiki/Flerovium"),
            new elements(actinidis, Sintetics, "F", "9", "Fluor", "18,998403", "https://es.wikipedia.org/wiki/Flour"),
            new elements(halogens, Gasos, "P", "15", "Fosforo", "39,97696", "https://es.wikipedia.org/wiki/Fosforo"),
            new elements(metallAlc, solid, "Fr", "87", "Francio", "223", "https://es.wikipedia.org/wiki/Francio"),
            new elements(lantanids, solid, "Gd", "64", "Gadolinio", "157,25", "https://es.wikipedia.org/wiki/Gandolinio"),
            new elements(metallsBlocP, solid, "Ga", "31", "Galio", "69,723", "https://es.wikipedia.org/wiki/Galio"),
            new elements(Metaloidess, solid, "Ge", "32", "Germanio", "77,64", "https://es.wikipedia.org/wiki/Germanio"),
            new elements(MetallTrans, solid, "Hf", "72", "Hafnio", "69,723", "https://es.wikipedia.org/wiki/Hafnio"),
            new elements(MetallTrans, Sintetics, "Hs", "108", "Hassio", "277", "https://es.wikipedia.org/wiki/Hassio"),
            new elements(gasNoble, Gasos, "He", "2", "Helio", "4,002602", "https://es.wikipedia.org/wiki/Helio"),
            new elements(noMetalls, Gasos, "H", "1", "Hidrogeno", "1,00794", "https://es.wikipedia.org/wiki/Hidrogeno"),
            new elements(MetallTrans, solid, "Fe", "26", "Hierro", "55,845", "https://es.wikipedia.org/wiki/Hierro"),
            new elements(lantanids, solid, "Ho", "67", "Holmio", "164,9303", "https://es.wikipedia.org/wiki/Holmio"),
            new elements(metallsBlocP, solid, "In", "49", "Indio", "114,82", "https://es.wikipedia.org/wiki/Indio"),
            new elements(halogens, solid, "I", "53", "Iodo", "126,904", "https://es.wikipedia.org/wiki/Iodo"),
            new elements(MetallTrans, solid, "Ir", "77", "Iridio", "192,2", "https://es.wikipedia.org/wiki/Iridio"),
            new elements(lantanids, solid, "Yb", "70", "Iterbio", "173,04", "https://es.wikipedia.org/wiki/Iterbio"),
            new elements(MetallTrans, solid, "Y", "39", "Itrio", "88,906", "https://es.wikipedia.org/wiki/Itrio"),
            new elements(gasNoble, Gasos, "Kr", "36", "krypton", "83,80", "https://es.wikipedia.org/wiki/Krypton"),
            new elements(actinidis, solid, "La", "57", "Latano", "", "https://es.wikipedia.org/wiki/Latano"),
            new elements(actinidis, Sintetics, "Lr", "103", "Lawrencio", "262", "https://es.wikipedia.org/wiki/Lawrencio"),
            new elements(metallAlc, solid, "Li", "3", "Litio", "6,941", "https://es.wikipedia.org/wiki/Litio"),
            new elements(metallsBlocP, Sintetics, "Lv", "116", "Livermorium", "", "https://es.wikipedia.org/wiki/Livermorium"),
            new elements(lantanids, solid, "Lu", "71", "Lutecio", "174,97", "https://es.wikipedia.org/wiki/Lutecio"),
            new elements(halogens, solid, "Mg", "12", "Magnesio", "25,305", "https://es.wikipedia.org/wiki/Magnesio"),
            new elements(MetallTrans, solid, "Mn", "25", "Manganeso", "54,938", "https://es.wikipedia.org/wiki/Manganeso"),
            new elements(MetallTrans, Sintetics, "Mn", "109", "Meitnerio", "266", "https://es.wikipedia.org/wiki/Meitnerio"),
            new elements(actinidis, Sintetics, "Md", "101", "Mendelevio", "258", "https://es.wikipedia.org/wiki/Mendelevio"),
            new elements(MetallTrans, liquid, "Hg", "80", "Mercurio", "200,59", "https://es.wikipedia.org/wiki/Mercurio"),
            new elements(MetallTrans, solid, "Mo", "42", "Molibdeno", "95,94", "https://es.wikipedia.org/wiki/Molibdeno"),
            new elements(metallsBlocP, Sintetics, "Mc", "115", "Moscovium", "", "https://es.wikipedia.org/wiki/Moscovium"),
            new elements(lantanids, solid, "Nd", "60", "Neodimio", "144,24", "https://es.wikipedia.org/wiki/Neodimio"),
            new elements(gasNoble, Gasos, "Ne", "10", "Neon", "20,179", "https://es.wikipedia.org/wiki/Neon"),
            new elements(actinidis, Sintetics, "Np", "93", "Neptunio", "30,9738", "https://es.wikipedia.org/wiki/Neptunio"),
            new elements(metallsBlocP, Sintetics, "Nh", "113", "Nihonium", "", "https://es.wikipedia.org/wiki/Nihonium"),
            new elements(MetallTrans, solid, "Nb", "41", "Niobio", "92,906", "https://es.wikipedia.org/wiki/Niobio"),
            new elements(MetallTrans, solid, "Ni", "28", "Niquel", "58,71", "https://es.wikipedia.org/wiki/Niquel"),
            new elements(noMetalls, Gasos, "N", "7", "Nitrogen", "14,0067", "https://es.wikipedia.org/wiki/Nitrogeno"),
            new elements(actinidis, Sintetics, "No", "102", "Nobelio", "259", "https://es.wikipedia.org/wiki/Nobelio"),
            new elements(gasNoble, Gasos, "Og", "118", "Oganesón", "286", "https://es.wikipedia.org/wiki/Oganesón"),
            new elements(MetallTrans, solid, "Au", "79", "Oro", "196,967", "https://es.wikipedia.org/wiki/Oro"),
            new elements(noMetalls, Gasos, "O", "8", "Oxígeno", "15,99994", "https://es.wikipedia.org/wiki/Oxígeno"),
            new elements(MetallTrans, solid, "Pd", "46", "Paladio", "106,4", "https://es.wikipedia.org/wiki/Paladio"),
            new elements(MetallTrans, solid, "Ag", "47", "Plata", "107,87", "https://es.wikipedia.org/wiki/Plata"),
            new elements(MetallTrans, solid, "Pt", "78", "Platino", "195,09", "https://es.wikipedia.org/wiki/Platino"),
            new elements(metallsBlocP, solid, "Pb", "82", "Plomo", "207,19", "https://es.wikipedia.org/wiki/Plomo"),
            new elements(actinidis, solid, "Pu", "94", "Plutonio", "242", "https://es.wikipedia.org/wiki/Plutonio"),
            new elements(Metaloidess, solid, "Po", "84", "Polonio", "210", "https://es.wikipedia.org/wiki/Plonio"),
            new elements(metallAlc, solid, "K", "19", "Potasio", "39,098", "https://es.wikipedia.org/wiki/Potasio"),
            new elements(lantanids, solid, "Pr", "59", "Praseodimio", "140,907", "https://es.wikipedia.org/wiki/Praseodimio"),
            new elements(lantanids, solid, "Pm", "61", "Promecio", "147", "https://es.wikipedia.org/wiki/Promecio"),
            new elements(actinidis, solid, "Pa", "91", "Protactinio", "231", "https://es.wikipedia.org/wiki/Protactinio"),
            new elements(alcalinoterris, solid, "Ra", "88", "Radio", "226", "https://es.wikipedia.org/wiki/Radio"),
            new elements(gasNoble, Gasos, "Rn", "86", "Radón", "222", "https://es.wikipedia.org/wiki/Radón"),
            new elements(MetallTrans, solid, "Re", "75", "Renio", "186,2", "https://es.wikipedia.org/wiki/Renio"),
            new elements(MetallTrans, solid, "Rh", "45", "Rodio", "102,905", "https://es.wikipedia.org/wiki/Rodio"),
            new elements(MetallTrans, Sintetics, "Rg", "111", "Roentgenium", "271,8", "https://es.wikipedia.org/wiki/Roentgenium"),
            new elements(metallAlc, solid, "Rb", "37", "Rubidio", "85,47", "https://es.wikipedia.org/wiki/Rubidio"),
            new elements(MetallTrans, solid, "Ru", "44", "Rutenio", "101,07", "https://es.wikipedia.org/wiki/Rutenio"),
            new elements(MetallTrans, Sintetics, "Rf", "104", "Rutherfordio", "261", "https://es.wikipedia.org/wiki/Rutherfordio"),
            new elements(lantanids, solid, "Sm", "62", "Samario", "263", "https://es.wikipedia.org/wiki/Samario"),
            new elements(MetallTrans, Sintetics, "Sg", "106", "Seaborgio", "1,00794", "https://es.wikipedia.org/wiki/Seaborgio"),
            new elements(metallAlc, solid, "Se", "34", "Selenio", "78,96", "https://es.wikipedia.org/wiki/Selenio"),
            new elements(Metaloidess, solid, "Si", "14", "Silicio", "28,086", "https://es.wikipedia.org/wiki/Silicio"),
            new elements(metallAlc, solid, "Na", "11", "Sodio", "22,9898", "https://es.wikipedia.org/wiki/Sodio"),
            new elements(metallsBlocP, solid, "Tl", "81", "Talio", "204,37", "https://es.wikipedia.org/wiki/Talio"),
            new elements(MetallTrans, solid, "Ta", "73", "Tantalio", "180,948", "https://es.wikipedia.org/wiki/Tantalio"),
            new elements(MetallTrans, Sintetics, "Tc", "43", "Tecnecio", "97", "https://es.wikipedia.org/wiki/Tecnecio"),
            new elements(Metaloidess, solid, "Te", "52", "Teluro", "127,60", "https://es.wikipedia.org/wiki/Teluro"),
            new elements(halogens, Sintetics, "Ts", "117", "Tennessine", "294", "https://es.wikipedia.org/wiki/Tennessine"),
            new elements(lantanids, solid, "Tb", "65", "Terbio", "158,924", "https://es.wikipedia.org/wiki/Terbio"),
            new elements(MetallTrans, solid, "Ti", "22", "Titanio", "47,90", "https://es.wikipedia.org/wiki/Titanio"),
            new elements(actinidis, solid, "Th", "90", "Torio", "232,083", "https://es.wikipedia.org/wiki/Torio"),
            new elements(lantanids, solid, "Tm", "69", "Tulio", "168,934", "https://es.wikipedia.org/wiki/Tulio"),
            new elements(actinidis, solid, "U", "92", "Uranio", "238,03", "https://es.wikipedia.org/wiki/Uranio"),
            new elements(MetallTrans, solid, "V", "23", "Vanadio", "50,942", "https://es.wikipedia.org/wiki/Vanadio"),
            new elements(MetallTrans, solid, "W", "74", "Wolframio", "183,85", "https://es.wikipedia.org/wiki/Wolframio"),
            new elements(gasNoble, Gasos, "Xe", "54", "Xenón", "131,30", "https://es.wikipedia.org/wiki/Xenón"),
            new elements(MetallTrans, solid, "Zn", "30", "Zinc", "65,37", "https://es.wikipedia.org/wiki/Zinc"),
            new elements(MetallTrans, solid, "Zr", "40", "Zirconio", "91,22", "https://es.wikipedia.org/wiki/Zirconio"),
            new elements(metallsBlocP, solid, "In", "49", "Indio", "114,82", "https://es.wikipedia.org/wiki/Indio"),
            new elements(halogens, solid, "I", "53", "Iodo", "126,904", "https://es.wikipedia.org/wiki/Iodo"),
            new elements(MetallTrans, solid, "Ir", "77", "Iridio", "192,2", "https://es.wikipedia.org/wiki/Iridio"),
            new elements(lantanids, solid, "Yb", "70", "Iterbio", "173,04", "https://es.wikipedia.org/wiki/Iterbio"),
            new elements(MetallTrans, solid, "Y", "39", "Itrio", "88,906", "https://es.wikipedia.org/wiki/Itrio"),

    };


    private elements[] liquids = new elements[]{
            new elements(noMetalls, liquid, "Br", "35", "Bromo", "79.909", "https://es.wikipedia.org/wiki/Bromo"),
            new elements(MetallTrans, liquid, "Hg", "80", "Mercurio", "200,59", "https://es.wikipedia.org/wiki/Mercurio"),
    };

    private elements[] solids = new elements[]{
            new elements(actinidis, solid, "Ac", "89", "Actinio", "10.070", "https://es.wikipedia.org/wiki/Actinio"),
            new elements(metallsBlocP, solid, "Al", "13", "Aluminio", "26,9815", "https://es.wikipedia.org/wiki/Aluminio"),
            new elements(actinidis, solid, "Am", "95", "Americio", "243", "https://es.wikipedia.org/wiki/Americio"),
            new elements(Metaloidess, solid, "Sb", "51", "Antimonio", "121,76", "https://es.wikipedia.org/wiki/Antimonio"),
            new elements(Metaloidess, solid, "As", "33", "Arsénico", "74,922", "https://es.wikipedia.org/wiki/Arsénico"),
            new elements(halogens, solid, "At", "85", "Astato", "210", "https://es.wikipedia.org/wiki/Astato"),
            new elements(noMetalls, solid, "S", "16", "Azufre", "32,064", "https://es.wikipedia.org/wiki/Azufre"),
            new elements(alcalinoterris, solid, "Ba", "56", "Bario", "137,34", "https://es.wikipedia.org/wiki/Bario"),
            new elements(alcalinoterris, solid, "Be", "4", "Berilio", "9,0122", "https://es.wikipedia.org/wiki/Berilio"),
            new elements(actinidis, solid, "Bk", "97", "Berkelio", "247", "https://es.wikipedia.org/wiki/Berkelio"),
            new elements(metallsBlocP, solid, "Bi", "83", "Bismuto", "208,980", "https://es.wikipedia.org/wiki/Bismuto"),
            new elements(MetallTrans, solid, "Bh", "107", "Bohrio", "262", "https://es.wikipedia.org/wiki/Bohrio"),
            new elements(Metaloidess, solid, "B", "5", "Boro", "10,811", "https://es.wikipedia.org/wiki/Boro"),
            new elements(MetallTrans, solid, "Cd", "48", "Cadmio", "112,40", "https://es.wikipedia.org/wiki/Cadmio"),
            new elements(alcalinoterris, solid, "Ca", "20", "Calcio", "40,08", "https://es.wikipedia.org/wiki/Calcio"),
            new elements(actinidis, solid, "Cf", "98", "Californio", "251", "https://es.wikipedia.org/wiki/Californio"),
            new elements(noMetalls, solid, "C", "6", "Carbono", "12,01115", "https://es.wikipedia.org/wiki/Carbono"),
            new elements(lantanids, solid, "Ce", "58", "Cerio", "140,12", "https://es.wikipedia.org/wiki/Cerio"),
            new elements(alcalinoterris, solid, "Cs", "55", "Cesio", "132,905", "https://es.wikipedia.org/wiki/Cesio"),
            new elements(MetallTrans, solid, "Co", "27", "Cobalto", "58,93", "https://es.wikipedia.org/wiki/Cobalto"),
            new elements(MetallTrans, solid, "Cu", "29", "Cobre", "63,54", "https://es.wikipedia.org/wiki/Cobre"),
            new elements(MetallTrans, solid, "Cn", "112", "Copernicio", "285", "https://es.wikipedia.org/wiki/Copernicio"),
            new elements(MetallTrans, solid, "Cr", "24", "Cromo", "51,9962", "https://es.wikipedia.org/wiki/Cromo"),
            new elements(lantanids, solid, "Dy", "66", "Disprosio", "162,500", "https://es.wikipedia.org/wiki/Disprosio"),
            new elements(lantanids, solid, "Er", "68", "Erbio", "167,259", "https://es.wikipedia.org/wiki/Erbio"),
            new elements(MetallTrans, solid, "Sc", "21", "Escandio", "44,95591", "https://es.wikipedia.org/wiki/Escandio"),
            new elements(metallsBlocP, solid, "Sn", "50", "Estaño", "118,710", "https://es.wikipedia.org/wiki/Estaño"),
            new elements(alcalinoterris, solid, "Sr", "38", "Estroncio", "87,62", "https://es.wikipedia.org/wiki/Esternocio"),
            new elements(lantanids, solid, "Eu", "63", "Europio", "151,964", "https://es.wikipedia.org/wiki/Europio"),
            new elements(metallAlc, solid, "Fr", "87", "Francio", "223", "https://es.wikipedia.org/wiki/Francio"),
            new elements(lantanids, solid, "Gd", "64", "Gadolinio", "157,25", "https://es.wikipedia.org/wiki/Gadolinio"),
            new elements(metallsBlocP, solid, "Ga", "31", "Galio", "69,723", "https://es.wikipedia.org/wiki/Galio"),
            new elements(Metaloidess, solid, "Ge", "32", "Germanio", "77,64", "https://es.wikipedia.org/wiki/Germanio"),
            new elements(MetallTrans, solid, "Hf", "72", "Hafnio", "69,723", "https://es.wikipedia.org/wiki/Hafnio"),
            new elements(MetallTrans, solid, "Fe", "26", "Hierro", "55,845", "https://es.wikipedia.org/wiki/Hierro"),
            new elements(lantanids, solid, "Ho", "67", "Holmio", "164,9303", "https://es.wikipedia.org/wiki/Holmio"),
            new elements(actinidis, solid, "La", "57", "Latano", "", "https://es.wikipedia.org/wiki/Latano"),
            new elements(metallAlc, solid, "Li", "3", "Litio", "6,941", "https://es.wikipedia.org/wiki/Litio"),
            new elements(lantanids, solid, "Lu", "71", "Lutecio", "174,97", "https://es.wikipedia.org/wiki/Lutecio"),
            new elements(halogens, solid, "Mg", "12", "Magnesio", "25,305", "https://es.wikipedia.org/wiki/Magnesio"),
            new elements(MetallTrans, solid, "Mn", "25", "Manganeso", "54,938", "https://es.wikipedia.org/wiki/Manganeso"),
            new elements(MetallTrans, solid, "Mo", "42", "Molibdeno", "95,94", "https://es.wikipedia.org/wiki/Molibdeno"),
            new elements(lantanids, solid, "Nd", "60", "Neodimio", "144,24", "https://es.wikipedia.org/wiki/Neodimio"),
            new elements(MetallTrans, solid, "Nb", "41", "Niobio", "92,906", "https://es.wikipedia.org/wiki/niobio"),
            new elements(MetallTrans, solid, "Ni", "28", "Niquel", "58,71", "https://es.wikipedia.org/wiki/Niquel"),
            new elements(MetallTrans, solid, "Au", "79", "Oro", "196,967", "https://es.wikipedia.org/wiki/Oro"),
            new elements(MetallTrans, solid, "Pd", "46", "Paladio", "106,4", "https://es.wikipedia.org/wiki/Paladio"),
            new elements(MetallTrans, solid, "Ag", "47", "Plata", "107,87", "https://es.wikipedia.org/wiki/Plata"),
            new elements(MetallTrans, solid, "Pt", "78", "Platino", "195,09", "https://es.wikipedia.org/wiki/Platino"),
            new elements(metallsBlocP, solid, "Pb", "82", "Plomo", "207,19", "https://es.wikipedia.org/wiki/Plomo"),
            new elements(actinidis, solid, "Pu", "94", "Plutonio", "242", "https://es.wikipedia.org/wiki/Plutonio"),
            new elements(Metaloidess, solid, "Po", "84", "Polonio", "210", "https://es.wikipedia.org/wiki/Plonio"),
            new elements(metallAlc, solid, "K", "19", "Potasio", "39,098", "https://es.wikipedia.org/wiki/Potasio"),
            new elements(lantanids, solid, "Pr", "59", "Praseodimio", "140,907", "https://es.wikipedia.org/wiki/Praseodimio"),
            new elements(lantanids, solid, "Pm", "61", "Promecio", "147", "https://es.wikipedia.org/wiki/Promecio"),
            new elements(actinidis, solid, "Pa", "91", "Protactinio", "231", "https://es.wikipedia.org/wiki/Protactinio"),
            new elements(alcalinoterris, solid, "Ra", "88", "Radio", "226", "https://es.wikipedia.org/wiki/Radio"),
            new elements(MetallTrans, solid, "Re", "75", "Renio", "186,2", "https://es.wikipedia.org/wiki/Renio"),
            new elements(MetallTrans, solid, "Rh", "45", "Rodio", "102,905", "https://es.wikipedia.org/wiki/Rodio"),
            new elements(metallAlc, solid, "Rb", "37", "Rubidio", "85,47", "https://es.wikipedia.org/wiki/Rubidio"),
            new elements(MetallTrans, solid, "Ru", "44", "Rutenio", "101,07", "https://es.wikipedia.org/wiki/Rutenio"),
            new elements(lantanids, solid, "Sm", "62", "Samario", "263", "https://es.wikipedia.org/wiki/Samario"),
            new elements(metallAlc, solid, "Se", "34", "Selenio", "78,96", "https://es.wikipedia.org/wiki/Selenio"),
            new elements(Metaloidess, solid, "Si", "14", "Silicio", "28,086", "https://es.wikipedia.org/wiki/Silicio"),
            new elements(metallAlc, solid, "Na", "11", "Sodio", "22,9898", "https://es.wikipedia.org/wiki/Sodio"),
            new elements(metallsBlocP, solid, "Tl", "81", "Talio", "204,37", "https://es.wikipedia.org/wiki/Talio"),
            new elements(MetallTrans, solid, "Ta", "73", "Tantalio", "180,948", "https://es.wikipedia.org/wiki/Tantalio"),
            new elements(Metaloidess, solid, "Te", "52", "Teluro", "127,60", "https://es.wikipedia.org/wiki/Teluro"),
            new elements(lantanids, solid, "Tb", "65", "Terbio", "158,924", "https://es.wikipedia.org/wiki/Terbio"),
            new elements(MetallTrans, solid, "Ti", "22", "Titanio", "47,90", "https://es.wikipedia.org/wiki/Titanio"),
            new elements(actinidis, solid, "Th", "90", "Torio", "232,083", "https://es.wikipedia.org/wiki/Torio"),
            new elements(lantanids, solid, "Tm", "69", "Tulio", "168,934", "https://es.wikipedia.org/wiki/Tulio"),
            new elements(actinidis, solid, "U", "92", "Uranio", "238,03", "https://es.wikipedia.org/wiki/Uranio"),
            new elements(MetallTrans, solid, "V", "23", "Vanadio", "50,942", "https://es.wikipedia.org/wiki/Vanadio"),
            new elements(MetallTrans, solid, "W", "74", "Wolframio", "183,85", "https://es.wikipedia.org/wiki/Wolframio"),
            new elements(MetallTrans, solid, "Zn", "30", "Zinc", "65,37", "https://es.wikipedia.org/wiki/Zinc"),
            new elements(MetallTrans, solid, "Zr", "40", "Zirconio", "91,22", "https://es.wikipedia.org/wiki/Zirconio"),
            new elements(metallsBlocP, solid, "In", "49", "Indio", "114,82", "https://es.wikipedia.org/wiki/Indio"),
            new elements(halogens, solid, "I", "53", "Iodo", "126,904", "https://es.wikipedia.org/wiki/Iodo"),
            new elements(MetallTrans, solid, "Ir", "77", "Iridio", "192,2", "https://es.wikipedia.org/wiki/Iridio"),
            new elements(lantanids, solid, "Yb", "70", "Iterbio", "173,04", "https://es.wikipedia.org/wiki/Iterbio"),
            new elements(MetallTrans, solid, "Y", "39", "Itrio", "88,906", "https://es.wikipedia.org/wiki/Itrio"),
    };




    private elements[] sintetics = new elements[]{
            new elements(halogens, Sintetics, "Ts", "117", "Tennessine", "294", "https://es.wikipedia.org/wiki/Tennessine"),
            new elements(MetallTrans, Sintetics, "Tc", "43", "Tecnecio", "97", "https://es.wikipedia.org/wiki/Tecnecio"),
            new elements(MetallTrans, Sintetics, "Rg", "111", "Roentgenium", "271,8", "https://es.wikipedia.org/wiki/Roentgenium"),
            new elements(MetallTrans, Sintetics, "Rf", "104", "Rutherfordio", "261", "https://es.wikipedia.org/wiki/Rutherfordio"),
            new elements(MetallTrans, Sintetics, "Sg", "106", "Seaborgio", "1,00794", "https://es.wikipedia.org/wiki/Seaborgio"),
            new elements(actinidis, Sintetics, "Lr", "103", "Lawrencio", "262", "https://es.wikipedia.org/wiki/Lawrencio"),
            new elements(metallsBlocP, Sintetics, "Lv", "116", "Livermorium", "292", "https://es.wikipedia.org/wiki/Rutherfordio"),
            new elements(MetallTrans, Sintetics, "Mn", "109", "Meitnerio", "266", "https://es.wikipedia.org/wiki/Meitnerio"),
            new elements(actinidis, Sintetics, "Md", "101", "Mendelevio", "258", "https://es.wikipedia.org/wiki/Mendelevio"),
            new elements(metallsBlocP, Sintetics, "Mc", "115", "Moscovium", "288", "https://es.wikipedia.org/wiki/Moscovium"),
            new elements(actinidis, Sintetics, "Np", "93", "Neptunio", "30,9738", "https://es.wikipedia.org/wiki/Neptunio"),
            new elements(metallsBlocP, Sintetics, "Nh", "113", "Nihonium", "284", "https://es.wikipedia.org/wiki/Nihonium"),
            new elements(actinidis, Sintetics, "No", "102", "Nobelio", "259", "https://es.wikipedia.org/wiki/Nobelio"),
            new elements(actinidis, Sintetics, "Cm", "96", "Curio", "247", "https://es.wikipedia.org/wiki/Curio"),
            new elements(MetallTrans, Sintetics, "Ds", "110", "Darmstadio", "271", "https://es.wikipedia.org/wiki/Darmstadio"),
            new elements(MetallTrans, Sintetics, "Db", "105", "Dubnio", "264", "https://es.wikipedia.org/wiki/Dubnio"),
            new elements(actinidis, Sintetics, "Es", "99", "Einstenio", "252", "https://es.wikipedia.org/wiki/Einstenio"),
            new elements(actinidis, Sintetics, "Fm", "100", "Fermio", "257", "https://es.wikipedia.org/wiki/Fermio"),
            new elements(metallsBlocP, Sintetics, "FI", "114", "Flerovium", "289", "https://es.wikipedia.org/wiki/Flerovium"),
            new elements(actinidis, Sintetics, "F", "9", "Fluor", "18,998403", "https://es.wikipedia.org/wiki/Fluor"),
            new elements(MetallTrans, Sintetics, "Hs", "108", "Hassio", "277", "https://es.wikipedia.org/wiki/Hassio"),
    };
    private elements[] gasos = new elements[12];

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actionbar_opcions, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        opcioJoc=(ImageView) findViewById(R.id.opcioJoc);

        gasos[0]=elements[4];
        gasos[1]=elements[21];
        gasos[2]=elements[39];
        gasos[3]=elements[46];
        gasos[4]=elements[47];
        gasos[5]=elements[56];
        gasos[6]=elements[70];
        gasos[7]=elements[75];
        gasos[8]=elements[76];
        gasos[9]=elements[77];
        gasos[10]=elements[89];
        gasos[11]=elements[113];

        final String[] arrayInfo = new String[6];

// Accedim a la action bar
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle("Taula periodica"); // set the top title
        // Mostrem el botó enrera que cal capturar en l'envent onOptionsItemSelected
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdaptadorElements adaptadorElements = new AdaptadorElements(this, elements);

        ListView lstOpciones = (ListView) findViewById(R.id.list1);
        lstOpciones.setAdapter(adaptadorElements);


        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                arrayInfo[0]=elements[position].getNom();
                arrayInfo[1]=elements[position].getNúmero();
                arrayInfo[2]=elements[position].getSimbol();
                arrayInfo[3]=elements[position].getPes();
                arrayInfo[4]=elements[position].getPesAtom();
                arrayInfo[5]=elements[position].getLink();

                Intent intent = new Intent (MainActivity.this,InfoElemetns.class);

                Bundle b = new Bundle();
                b.putStringArray ("1234",arrayInfo);
                intent.putExtras(b);

                startActivityForResult(intent, 0);

            }
        });







    }




    class AdaptadorElements extends ArrayAdapter<elements> {



        public AdaptadorElements(Context context, elements[] elements) {
            super(context, R.layout.activity_info_elemetns, elements);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main, null);

            TextView lblNom = (TextView) item.findViewById(R.id.edtNom);
            lblNom.setText(elements[position].getNom());

            TextView lblSimbol = (TextView) item.findViewById(R.id.Simbol);
            lblSimbol.setText(elements[position].getSimbol());

            TextView lblNum = (TextView) item.findViewById(R.id.Numero);
            lblNum.setText(elements[position].getNúmero());

            TextView lblPes = (TextView) item.findViewById(R.id.Pes);
            lblPes.setText(elements[position].getPes());


            if (elements[position].getPesAtom().equals("solid")) {
                lblNum.setTextColor(Color.parseColor("#000000"));
            } else {
                if (elements[position].getPesAtom().equals("liquid")) {
                    lblNum.setTextColor(Color.parseColor("#0000ff"));
                } else {
                    if (elements[position].getPesAtom().equals("gasos")) {

                        lblNum.setTextColor(Color.parseColor("#2F8826"));
                    } else {
                        if (elements[position].getPesAtom().equals("sintetics")) {
                            lblNum.setTextColor(Color.parseColor("#D4443D"));
                        }
                    }
                }
            }

            if (elements[position].getSeriequimica().equals("Metall_Transicio")) {
                item.setBackgroundColor(Color.parseColor("#F95EF9"));
            } else {
                if (elements[position].getSeriequimica().equals("No_metalls")) {
                    item.setBackgroundColor(Color.parseColor("#A9EE7F"));
                } else if (elements[position].getSeriequimica().equals("Metall_Alcalins")) {
                    item.setBackgroundColor(Color.parseColor("#E98765"));
                } else {
                    if (elements[position].getSeriequimica().equals("Alcalinoterris")) {
                        item.setBackgroundColor(Color.parseColor("#E98765"));
                    } else if (elements[position].getSeriequimica().equals("Lantanids")) {
                        item.setBackgroundColor(Color.parseColor("#D8A0DB"));
                    } else {
                        if (elements[position].getSeriequimica().equals("Actinidis")) {
                            item.setBackgroundColor(Color.parseColor("#EC7063"));
                        } else if (elements[position].getSeriequimica().equals("Metalls_bloc_p")) {
                            item.setBackgroundColor(Color.parseColor("#ABB2B9"));
                        } else {
                            if (elements[position].getSeriequimica().equals("Metaloides")) {
                                item.setBackgroundColor(Color.parseColor("#6B8677"));
                            } else if (elements[position].getSeriequimica().equals("Halogens")) {
                                item.setBackgroundColor(Color.parseColor("#CAD524"));
                            } else {
                                if (elements[position].getSeriequimica().equals("Gasos_nobles")) {
                                    item.setBackgroundColor(Color.parseColor("#11E4CF"));
                                }



                            }
                        }
                    }
                }
            }
            return item;
        }

    }

    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {

            case R.id.itemLiquid:
                AdaptadorLiquids adaptadorLiquids = new AdaptadorLiquids(this, liquids);

                ListView lstOpciones = (ListView) findViewById(R.id.list1);
                lstOpciones.setAdapter(adaptadorLiquids);
                return true;

            case R.id.Solid:
                AdaptadorSolids adaptadorSolid = new AdaptadorSolids(this, solids);

                ListView lstSolids = (ListView) findViewById(R.id.list1);
                lstSolids.setAdapter(adaptadorSolid);
                return true;

            case R.id.Gasos:
                AdaptadorGasos adaptadorGasos = new AdaptadorGasos(this, gasos);

                ListView lstGasos = (ListView) findViewById(R.id.list1);
                lstGasos.setAdapter(adaptadorGasos);
                return true;

            case R.id.Sintetic:
                AdaptadorSintetics adaptadorSintetics = new AdaptadorSintetics(this, sintetics);

                ListView lstSintetics = (ListView) findViewById(R.id.list1);
                lstSintetics.setAdapter(adaptadorSintetics);
                return true;

            case R.id.opcioJoc:
                Intent intent = new Intent (MainActivity.this, JocElements.class);
                startActivity(intent);
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    class AdaptadorLiquids extends ArrayAdapter<elements> {

        public AdaptadorLiquids(Context context, elements[] elements) {
            super(context, R.layout.activity_main, elements);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main, null);

            TextView lblNom = (TextView) item.findViewById(R.id.edtNom);
            lblNom.setText(liquids[position].getNom());

            TextView lblSimbol = (TextView) item.findViewById(R.id.Simbol);
            lblSimbol.setText(liquids[position].getSimbol());

            TextView lblNum = (TextView) item.findViewById(R.id.Numero);
            lblNum.setText(liquids[position].getNúmero());

            TextView lblPes = (TextView) item.findViewById(R.id.Pes);
            lblPes.setText(liquids[position].getPes());


                    lblNum.setTextColor(Color.parseColor("#0000ff"));


            if (liquids[position].getSeriequimica().equals("Metall_Transicio")) {
                item.setBackgroundColor(Color.parseColor("#F95EF9"));
            } else {
                if (liquids[position].getSeriequimica().equals("No_metalls")) {
                    item.setBackgroundColor(Color.parseColor("#A9EE7F"));
                } else if (liquids[position].getSeriequimica().equals("Metall_Alcalins")) {
                    item.setBackgroundColor(Color.parseColor("#E98765"));
                } else {
                    if (liquids[position].getSeriequimica().equals("Alcalinoterris")) {
                        item.setBackgroundColor(Color.parseColor("#E98765"));
                    } else if (liquids[position].getSeriequimica().equals("Lantanids")) {
                        item.setBackgroundColor(Color.parseColor("#D8A0DB"));
                    } else {
                        if (liquids[position].getSeriequimica().equals("Actinidis")) {
                            item.setBackgroundColor(Color.parseColor("#EC7063"));
                        } else if (liquids[position].getSeriequimica().equals("Metalls_bloc_p")) {
                            item.setBackgroundColor(Color.parseColor("#ABB2B9"));
                        } else {
                            if (liquids[position].getSeriequimica().equals("Metaloides")) {
                                item.setBackgroundColor(Color.parseColor("#6B8677"));
                            } else if (liquids[position].getSeriequimica().equals("Halogens")) {
                                item.setBackgroundColor(Color.parseColor("#CAD524"));
                            } else {
                                if (liquids[position].getSeriequimica().equals("Gasos_nobles")) {
                                    item.setBackgroundColor(Color.parseColor("#11E4CF"));
                                }



                            }
                        }
                    }
                }
            }
            return item;
        }

    }


    class AdaptadorSolids extends ArrayAdapter<elements> {

        public AdaptadorSolids(Context context, elements[] elements) {
            super(context, R.layout.activity_main, elements);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main, null);

            TextView lblNom = (TextView) item.findViewById(R.id.edtNom);
            lblNom.setText(solids[position].getNom());

            TextView lblSimbol = (TextView) item.findViewById(R.id.Simbol);
            lblSimbol.setText(solids[position].getSimbol());

            TextView lblNum = (TextView) item.findViewById(R.id.Numero);
            lblNum.setText(solids[position].getNúmero());

            TextView lblPes = (TextView) item.findViewById(R.id.Pes);
            lblPes.setText(solids[position].getPes());


                lblNum.setTextColor(Color.parseColor("#000000"));


            if (solids[position].getSeriequimica().equals("Metall_Transicio")) {
                item.setBackgroundColor(Color.parseColor("#F95EF9"));
            } else {
                if (solids[position].getSeriequimica().equals("No_metalls")) {
                    item.setBackgroundColor(Color.parseColor("#A9EE7F"));
                } else if (solids[position].getSeriequimica().equals("Metall_Alcalins")) {
                    item.setBackgroundColor(Color.parseColor("#E98765"));
                } else {
                    if (solids[position].getSeriequimica().equals("Alcalinoterris")) {
                        item.setBackgroundColor(Color.parseColor("#E98765"));
                    } else if (solids[position].getSeriequimica().equals("Lantanids")) {
                        item.setBackgroundColor(Color.parseColor("#D8A0DB"));
                    } else {
                        if (solids[position].getSeriequimica().equals("Actinidis")) {
                            item.setBackgroundColor(Color.parseColor("#EC7063"));
                        } else if (solids[position].getSeriequimica().equals("Metalls_bloc_p")) {
                            item.setBackgroundColor(Color.parseColor("#ABB2B9"));
                        } else {
                            if (solids[position].getSeriequimica().equals("Metaloides")) {
                                item.setBackgroundColor(Color.parseColor("#6B8677"));
                            } else if (solids[position].getSeriequimica().equals("Halogens")) {
                                item.setBackgroundColor(Color.parseColor("#CAD524"));
                            } else {
                                if (solids[position].getSeriequimica().equals("Gasos_nobles")) {
                                    item.setBackgroundColor(Color.parseColor("#11E4CF"));
                                }



                            }
                        }
                    }
                }
            }
            return item;
        }

    }

    class AdaptadorGasos extends ArrayAdapter<elements> {

        public AdaptadorGasos(Context context, elements[] elements) {
            super(context, R.layout.activity_main, elements);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main, null);

            TextView lblNom = (TextView) item.findViewById(R.id.edtNom);
            lblNom.setText(gasos[position].getNom());

            TextView lblSimbol = (TextView) item.findViewById(R.id.Simbol);
            lblSimbol.setText(gasos[position].getSimbol());

            TextView lblNum = (TextView) item.findViewById(R.id.Numero);
            lblNum.setText(gasos[position].getNúmero());

            TextView lblPes = (TextView) item.findViewById(R.id.Pes);
            lblPes.setText(gasos[position].getPes());


            lblNum.setTextColor(Color.parseColor("#2F8826"));



            if (gasos[position].getSeriequimica().equals("Metall_Transicio")) {
                item.setBackgroundColor(Color.parseColor("#F95EF9"));
            } else {
                if (gasos[position].getSeriequimica().equals("No_metalls")) {
                    item.setBackgroundColor(Color.parseColor("#A9EE7F"));
                } else if (gasos[position].getSeriequimica().equals("Metall_Alcalins")) {
                    item.setBackgroundColor(Color.parseColor("#E98765"));
                } else {
                    if (gasos[position].getSeriequimica().equals("Alcalinoterris")) {
                        item.setBackgroundColor(Color.parseColor("#E98765"));
                    } else if (gasos[position].getSeriequimica().equals("Lantanids")) {
                        item.setBackgroundColor(Color.parseColor("#D8A0DB"));
                    } else {
                        if (gasos[position].getSeriequimica().equals("Actinidis")) {
                            item.setBackgroundColor(Color.parseColor("#EC7063"));
                        } else if (gasos[position].getSeriequimica().equals("Metalls_bloc_p")) {
                            item.setBackgroundColor(Color.parseColor("#ABB2B9"));
                        } else {
                            if (gasos[position].getSeriequimica().equals("Metaloides")) {
                                item.setBackgroundColor(Color.parseColor("#6B8677"));
                            } else if (gasos[position].getSeriequimica().equals("Halogens")) {
                                item.setBackgroundColor(Color.parseColor("#CAD524"));
                            } else {
                                if (gasos[position].getSeriequimica().equals("Gasos_nobles")) {
                                    item.setBackgroundColor(Color.parseColor("#11E4CF"));
                                }



                            }
                        }
                    }
                }
            }
            return item;
        }

    }


    class AdaptadorSintetics extends ArrayAdapter<elements> {

        public AdaptadorSintetics(Context context, elements[] elements) {
            super(context, R.layout.activity_main, elements);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main, null);

            TextView lblNom = (TextView) item.findViewById(R.id.edtNom);
            lblNom.setText(sintetics[position].getNom());

            TextView lblSimbol = (TextView) item.findViewById(R.id.Simbol);
            lblSimbol.setText(sintetics[position].getSimbol());

            TextView lblNum = (TextView) item.findViewById(R.id.Numero);
            lblNum.setText(sintetics[position].getNúmero());

            TextView lblPes = (TextView) item.findViewById(R.id.Pes);
            lblPes.setText(sintetics[position].getPes());


            lblNum.setTextColor(Color.parseColor("#2F8826"));



            if (sintetics[position].getSeriequimica().equals("Metall_Transicio")) {
                item.setBackgroundColor(Color.parseColor("#F95EF9"));
            } else {
                if (sintetics[position].getSeriequimica().equals("No_metalls")) {
                    item.setBackgroundColor(Color.parseColor("#A9EE7F"));
                } else if (sintetics[position].getSeriequimica().equals("Metall_Alcalins")) {
                    item.setBackgroundColor(Color.parseColor("#E98765"));
                } else {
                    if (sintetics[position].getSeriequimica().equals("Alcalinoterris")) {
                        item.setBackgroundColor(Color.parseColor("#E98765"));
                    } else if (sintetics[position].getSeriequimica().equals("Lantanids")) {
                        item.setBackgroundColor(Color.parseColor("#D8A0DB"));
                    } else {
                        if (sintetics[position].getSeriequimica().equals("Actinidis")) {
                            item.setBackgroundColor(Color.parseColor("#EC7063"));
                        } else if (sintetics[position].getSeriequimica().equals("Metalls_bloc_p")) {
                            item.setBackgroundColor(Color.parseColor("#ABB2B9"));
                        } else {
                            if (sintetics[position].getSeriequimica().equals("Metaloides")) {
                                item.setBackgroundColor(Color.parseColor("#6B8677"));
                            } else if (sintetics[position].getSeriequimica().equals("Halogens")) {
                                item.setBackgroundColor(Color.parseColor("#CAD524"));
                            } else {
                                if (sintetics[position].getSeriequimica().equals("Gasos_nobles")) {
                                    item.setBackgroundColor(Color.parseColor("#11E4CF"));
                                }



                            }
                        }
                    }
                }
            }
            return item;
        }

    }




}