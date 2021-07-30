public class B {
static class cleancode {

int small;// for smallest number
int large; // for largest number
}

static cleancode  SmallestORLargest(int arr[], int n) {// arr represent the array and n is the length of it passed by cobj
cleancode objSL = new cleancode();


if (n == 1) { // if the array contain 1 item
objSL.large = arr[0];
objSL.small = arr[0];
return objSL;
}

if (arr[0] > arr[1]) { // if array contain 2 items
objSL.large = arr[0];
objSL.small = arr[1];
} else {
objSL.large = arr[1];
objSL.small= arr[0];
}

for (int i = 2; i < n; i++) { // array contain more than 2 items
if (arr[i] >objSL.large) {
objSL.large = arr[i];
} else if (arr[i] <objSL.small) {
objSL.small = arr[i];
}
}

return objSL;
}

public static void main(String args[]) {
int mainArray[] = {100,78,890,67,546,7890,890000,45736000};// declare the static array
int length = 8; // length of the array
cleancode cobj = SmallestORLargest(mainArray, length); // cobj used to initialized the array and it's length
System.out.printf("\n smallest number is %d", cobj.small); // fetch the smallest value by small variable
System.out.printf("\n largest number is %d", cobj.large);// fetch the largest value by large variable
}
}
