package io.javabrains.reactiveworkshop;

import java.util.Optional;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(e -> System.out.print(e + " "));
        System.out.println();
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(n -> n < 5).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(n -> n > 5).limit(2).forEach(e -> System.out.print(e + " "));
        System.out.println();
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Optional<Integer> a = StreamSources.intNumbersStream().filter(n -> n > 5).findFirst();
        System.out.println(a.isPresent() ? a.get() : "-1");
        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().forEach(e -> System.out.print(e.getFirstName() + " "));
        System.out.println();
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .forEach(id -> StreamSources.userStream().filter(e -> id == e.getId())
                        .forEach(e -> System.out.print(e.getFirstName() + " ")));
    }
}
