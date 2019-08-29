/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeMidTerm;

import java.util.HashSet;

/**
 *
 * @author luoze
 */
public class HashSets {

    public static void main(String[] args) {
        String a = "2";
        String b = a;
        String c = "2";
        String d = "2";

        HashSet<String> set = new HashSet<>();
        System.out.println(set.add(a));
        System.out.println(set.add(b));
        System.out.println(set.add(c));
        System.out.println(set.add(d));

    }
}
