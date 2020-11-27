/*
 * Hello dear reader,
 * You are probably familiar with the rules of the FizzBuzz programming test, but nevertheless I have the official task for you here:
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”
 *
 * - 1 to 100
 * - replace multiples of 3 with "Fizz
 * - replace multiples of 5 with "Buzz
 * - replace multiples of 3 and 5 with "FizzBuzz
 *
 * Here we go...
 */

fun main() {
    var i = 0
    while (i < 100) {
        i += 1
        print("\n$i ")

        if (i % 3 != 0 && i % 5 != 0) { // most likely case comes first
            continue
        }
        if (i % 3 == 0) { // 2nd most likely case comes second
            print("Fizz")
        }
        if (i % 5 == 0) { // 3rd most likely case comes third
            print("Buzz")
        }
    }
}