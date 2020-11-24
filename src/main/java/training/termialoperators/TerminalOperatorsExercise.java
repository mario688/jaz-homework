package training.termialoperators;

import jdk.dynalink.Operation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        stream.collect(Collectors.toCollection(()->set));


    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {

        stream.sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(()->list));


    }

    @Override
    public String[] collectToArray(Stream<String> stream) {

        return stream.toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {

        return stream.collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {

        return stream.collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {

        return "["+ stream.collect(Collectors.joining("-")) +"]";
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return stream.collect(Collectors.joining("")).length();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        Optional<String> optionalS = stream.max(Comparator.comparingInt(String::length));
        if(optionalS. isPresent())
        {return optionalS.get().length();
        }else return 0;
    }

    @Override
    public String longestWord(Stream<String> stream) {



        Optional<String> optionalS = stream.max(Comparator.comparingInt(String::length));
        if(optionalS. isPresent())
        {return optionalS.get();
        }else return "";

    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return Map.of();
    }
}
