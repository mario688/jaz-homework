package training.intermediateoperators;

import javachanges.java8.model.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {

    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        String SENTENCE = "Sometimes Sometimes to understand the meaning of words you need more than a definition Seeing the word in a sentence can provide more context and relevance";
        List<String> WORDS = Arrays.asList(SENTENCE.split(" "));
        return WORDS.stream()
                .filter(p->p.length()>5);

    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        String SENTENCE = "Sometimes Sometimes to understand the meaning of words you need more than a definition Seeing the word in a sentence can provide more context and relevance";
        List<String> WORDS = Arrays.asList(SENTENCE.split(" "));
        return WORDS.stream()
                .filter(p->p.length()>5)
                .limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
        String SENTENCE = "Sometimes Sometimes to understand the meaning of words you need more than a definition Seeing the word in a sentence can provide more context and relevance";
        List<String> WORDS = Arrays.asList(SENTENCE.split(" "));
        return WORDS.stream()
                .filter(p->p.length()>5)
                .distinct()
                .limit(3)
                .sorted(Comparator.reverseOrder());

    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        String SENTENCE = "Sometimes Sometimes to understand the meaning of words you need more than a definition Seeing the word in a sentence can provide more context and relevance";
        List<String> WORDS = Arrays.asList(SENTENCE.split(" "));
        return WORDS.stream().map(p->p.length());




    }

    @Override
    public Stream<Integer> staircase() {
        return Stream.empty();
    }
}
