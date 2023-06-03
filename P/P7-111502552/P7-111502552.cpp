/*
Practice 7
Name: 蕭登鴻
Student Number: 111502552
Course 2023-CE1004-B
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Species {
   private:
    const string name;
    string category;
    int number;

   public:
    Species() : name("human") {
        category = "Primates";
        number = 100;
    }

    Species(const string name, const string cate, int num) : name(name) {
        category = cate;
        number = num;
    }

    ~Species() {
        cout << "species " << name << " is deleted" << endl;
    }

    string getName() const {
        return name;
    }

    string getCate() const {
        return category;
    }

    int getNum() const {
        return number;
    }

    void setCate(string new_cate) {
        category = new_cate;
    }

    void setNum(int new_num) {
        number = new_num;
    }

    void showInfo() const {
        cout << name << " " << category << " " << number << endl;
    }
};

int main() {
    int number;
    string name, cate;

    Species s1;

    // s2
    cout << "please input species2 info(name/category/number)" << endl;
    cin >> name >> cate >> number;

    Species s2(name, cate, number);
    // ~s2

    string cmd;
    while (true) {
        cout << "1.change species info 2.show all species info 3.exit" << endl;
        cin >> cmd;

        if (cmd == "3") break;

        if (cmd == "1") {
            int tar;
            cout << "which species would you like to change(1/2)?" << endl;
            cin >> tar;

            cout << "input new info (category/ number)" << endl;
            cin >> cate >> number;

            Species *tar_spec = nullptr;
            if (tar == 1)
                tar_spec = &s1;
            else if (tar == 2)
                tar_spec = &s2;

            tar_spec->setCate(cate);
            tar_spec->setNum(number);
        } else if (cmd == "2") {
            s1.showInfo();
            s2.showInfo();
        }
    }
}
