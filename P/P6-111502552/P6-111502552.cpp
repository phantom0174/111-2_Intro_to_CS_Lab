/*
Practice 6
Name: 蕭登鴻
Student Number: 111502552
Course 2023-CE1004-B
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Transaction {
private:
    string name;
    int income = 0, pay = 0;

public:
    Transaction(string name) {
        this->name = name;
    }

    string getName() {
        return name;
    }

    int getIncome() {
        return income;
    }

    int getPay() {
        return pay;
    }

    void setIncome(int income) {
        this->income = income;
    }

    void setPay(int pay) {
        this->pay = pay;
    }
};

int main() {
    vector<Transaction> logs;

    string cmd;
    while (cin >> cmd) {
        if (cmd == "4") break;

        if (cmd == "1") {
            string name;
            int income;
            cin >> name >> income;

            Transaction trans(name);
            trans.setIncome(income);

            logs.push_back(trans);
        } else if (cmd == "2") {
            string name;
            int pay;
            cin >> name >> pay;

            Transaction trans(name);
            trans.setPay(pay);

            logs.push_back(trans);
        } else if (cmd == "3") {
            int sum = 0;
            for (auto trans : logs) {
                sum += trans.getIncome() - trans.getPay();
            }
            cout << "Total: " << sum << endl;
        } else {
            cout << "Invalid Operation" << endl;
        }
    }
}
