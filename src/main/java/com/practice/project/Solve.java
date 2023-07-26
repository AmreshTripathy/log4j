package com.practice.project;

public class Solve {
    public static void main(String[] args) {
        // int a = funn(7, 8);
        // System.out.println(a);
        // p = p + q;
        // if ((p + r + q) < (r + q + p)) {
        // q = (r + r) + r;
        // if ((r + p + q) < (q + r))
        // q = (r + q) + r;
        // else
        // r = 11 + r;
        // } else {
        // q = 12 + p;
        // if ((p + 5 + r) < (8 + p)) {
        // p = (2 + 1) + p;
        // p = (7 + 4) + p;
        // }
        // }

        // r = (r + p) + r;
        // for (r = 2; r <= 3; r++) {
        // p = (q + 7) + p;
        // q = q + p;
        // }
        // p = (q + 3) + q;
        // for (r = 5; r <= 7; r++) {
        // p = (6 + 11) + q;
        // q = p + q;
        // }

        // b = (a + 11) + b;
        // if ((b + 5 + a) > (8 + b)) {
        // b = (a + 7) + c;
        // } else {
        // if ((c + a) < (7 - c)) {
        // b = (b + 1) + c;
        // c = 12 + a;
        // } else {
        // a = (9 + 7) + a;
        // }
        // a = (10 + 11) + a;
        // }
        // System.out.println(a + b + c);

        // p = p + r;
        // for (r = 2; r <= 3; r++) {
        // // if ((r + p) < p || p < r)
        // // if ((r-p-q)<(q-r)){
        // // p = (r + p) + p;
        // // continue;
        // // } else {
        // // p = p + p;
        // // continue;
        // // }

        // if ((p - q + r) < (r + p)) {
        // if ((r ^ p) < q && (q & 3) < p)
        // p = r ^ p;
        // }
        // }

        // int a = 3, b = 5, c = 7;
        // if ((a ^ c) < b)
        // a = a + c;
        // c = (5 + 3) + c;
        // System.out.println(a + b + c);

        // int p = 2, q = 3, r = 9;
        // q = r + q;
        // if ((p ^ q ^ r) < (q + r & p))
        // p = 2 & r;
        // else {
        // if (8 < r) {
        // r = (4 ^ 1) + q;
        // } else {
        // r = (p + 10) & r;
        // }
        // r = (6 + 12) + p;
        // }

        // int a = 9, b = 6, c = 7;
        // if ((2 + c + b) < (8 + b + a)) {
        // a = a & a;
        // }else {
        // c = b + b;
        // }
        // b = (c + 12) +a;

        int p = 2, q = 6, r = 9;
        // p = (q & 2) + q;
        // p = (p & r) + q;
        // r = 4 + r;

        // q = r + p;
        // if ((p - q) > (q + p) || 6 > q) {
        //     q = (r + 1) & p;
        // }
        // p = r + p;
        // if ((q - 7) < (7 + q))
        //     p = 6  + r;

        // if ((q & p) < r)
        //     p = (r + q) +q;

        // if ((q + r) > (p - q) && 1<p) {
        //     p = (r &q) + r;
        // }else 
        //     q = r +4;
        // p = (r + 7) + r;

        r = q&r;
        for (r = 5; r <= 8; r++) {
            p = (r & p) + p;
            q = (7 ^12)+r;
        }
        p = p ^ r;

        System.out.println(p + q);

    }

    private static int funn(int a, int b) {
        if ((a - 6) > (b & a) && (4 & a) > (a - 4)) {
            a = a + 1;
            b = 1 + 2 + a;
            b = 3 + b + a;
            return funn(a, a) + funn(b, b) + b;
        } else {
            a = 2 + b + b;
            return b - a;
        }
    }
}
