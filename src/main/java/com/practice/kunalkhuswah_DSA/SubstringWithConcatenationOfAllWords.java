package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubstringWithConcatenationOfAllWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++)
			words[i] = sc.next();
		sc.close();

		List<Integer> lis = findSubstring(s, words);
		Collections.sort(lis);
		System.out.println(lis);
	}

	private static List<Integer> findSubstring(String s, String[] words) {
		if (s.isEmpty() || words.length == 0) {
			return new ArrayList<>();
		}

		// Initialize a list to store the starting indices of the concatenated
		// substrings
		List<Integer> indices = new ArrayList<>();

		// Initialize a map to store the counts of each word in the array of words
		Map<String, Integer> wordCounts = new HashMap<>();
		for (String word : words) {
			wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
		}

		// Initialize a map to store the counts of each word in the current substring
		Map<String, Integer> currentCounts = new HashMap<>();

		// Initialize variables to keep track of the length of each word and the total
		// length of all the words
		int wordLength = words[0].length();
		int totalLength = wordLength * words.length;

		// Loop through the input string, checking for concatenated substrings at each
		// position
		for (int i = 0; i < s.length() - totalLength + 1; i++) {
			// Initialize the current counts map for the new substring
			currentCounts.clear();

			// Loop through the words in the current substring and update their counts in
			// the current counts map
			for (int j = 0; j < words.length; j++) {
				String word = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
				currentCounts.put(word, currentCounts.getOrDefault(word, 0) + 1);
			}

			// Check if the current counts map is equal to the original word counts map
			if (currentCounts.equals(wordCounts)) {
				// If they are equal, add the starting index of the current substring to the
				// list of indices
				indices.add(i);
			}
		}

		// Return the list of indices
		return indices;
	}

//	private static List<Integer> findSubstring(String s, String[] words) {
//
//		if (s.length() < words.length)
//			return new ArrayList<Integer>();
//
//		Set<Integer> lis = makePattern(s, words, 0, new HashSet<Integer>());
//
//		return new ArrayList<Integer>(lis);
//	}
//
//	private static Set<Integer> makePattern(String s, String[] words, int index, Set<Integer> indexList) {
//
//		if (index == words.length) {
//			System.out.println(String.join(" ", words));
//			String str = String.join("", words);
//			int index_of_word = s.indexOf(str);
//			while (index_of_word >= 0) {
//				indexList.add(index_of_word);
//				index_of_word = s.indexOf(str, index_of_word + 1);
//			}
//			return indexList;
//		}
//
//		if (index > words.length)
//			return indexList;
//
//		for (int i = 0; i < words.length; i++) {
//			words = swap(words, i, index);
//			indexList = makePattern(s, words, index + 1, indexList);
//			words = swap(words, i, index);
//		}
//
//		return indexList;
//	}
//
//	private static String[] swap(String[] words, int i, int index) {
//
//		String s = words[i];
//		words[i] = words[index];
//		words[index] = s;
//
//		return words;
//	}
}
