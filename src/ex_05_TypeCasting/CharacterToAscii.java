package ex_05_TypeCasting;
/*
a	097		A	065
b	098		B	066
c	099		C	067
d	100		D	068
e	101		E	069
f	102		F	070
g	103		G	071
h	104		H	072
i	105		I	073
j	106		J	074
k	107		K	075
l	108		L	076
m	109		M	077
n	110		N	078
o	111		O	079
p	112		P	080
q	113		Q	081
r	114		R	082
s	115		S	083
t	116		T	084
u	117		U	085
v	118		V	086
w	119		W	087
x	120		X	088
y	121		Y	089
z	122 	Z	090

 */

public class CharacterToAscii {
    public static void main(String[] args) {
        char Alphabet = 'z';

        // Converting the char to ascii value

        int result = Alphabet;

        System.out.printf("The Ascii value of %c is: %d", Alphabet, result);
    }

}
