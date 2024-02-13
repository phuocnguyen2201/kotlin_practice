import java.util.Scanner
import java.io.File
import java.io.FileNotFoundException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val file = File("numbers.txt");
    println("Type a positive integer (-1 to exit):")
    var input = readLine()?.toInt()
    var index = 0;
    while (input != null && input != -1) {
        if (input > 0){
            file.appendText(input.toString()+"\n");
            index ++;
        }
        else
            println("The number must be positive")
        println("Type a positive integer (-1 to exit):")
        input = readLine()?.toInt()
    }

    var list = listOf<Double>();
    val line = file.readLines();
    line.forEach { ln -> list += ln.toDouble() }
    println("You typed "+index+" numbers.")

    println("The average is "+list.average().toDouble()+".")


}
fun printGreeting(firstName: String){
    println("Hello "+firstName)
}
fun printGreeting(firstName: String, lastName: String){
    println("Hello "+firstName +" "+lastName)
}
fun isEven(numb: Int): Boolean{
    if(numb%2 ==0)
        return true;
    else
        return false;
}
fun findMax(numb1: Int, numb2: Int, numb3: Int): Int{
    var largest = 0;

    if(numb1 > numb2 && numb1 > numb3){
        largest = numb1;
    }
    else if( numb2 > numb3 && numb2 > numb1){
        largest = numb2
    }
    else
    {
        largest = numb3
    }

    return largest;
}
fun isPalindrome(s: String): Boolean {
    // Remove spaces and convert to lowercase
    val cleanString = s.replace(" ", "").toLowerCase()

    // Compare the string with its reverse
    return cleanString == cleanString.reversed()
}