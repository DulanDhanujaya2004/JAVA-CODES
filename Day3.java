#include <stdio.h>


float calculateInterest(char accType, float balance) {
    float interest = 0;
//------------(1)------------//
    if (accType == 'S' || accType == 's') {
       
        if (balance >= 50000)
            interest = balance * 0.05;
        else if (balance >= 20000)
            interest = balance * 0.04;
        else
            interest = balance * 0.03;
    }
    else if (accType == 'F' || accType == 'f') {
       
        if (balance >= 100000)
            interest = balance * 0.07;
        else if (balance >= 50000)
            interest = balance * 0.06;
        else
            interest = balance * 0.05;
    }

    return interest;
}
//-------------(2)---------------//
int main() {
    char name[50];
    char accType;
    float balance, interest, total;

    printf("Enter customer name: ");
    scanf("%s", name);

    printf("Enter account type (S/F): ");
    scanf(" %c", &accType);

    printf("Enter balance: ");
    scanf("%f", &balance);

    interest = calculateInterest(accType, balance);
    total = balance + interest;
//--------------(3)--------------//
    printf("\n--- Customer %s ---\n", name);
    printf("Account Type : %c\n", accType);
    printf("Balance      : %.2f\n", balance);
    printf("Interest     : %.2f\n", interest);
    printf("Total Amount : %.2f\n", total);

    return 0;
}
