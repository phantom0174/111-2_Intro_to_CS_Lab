/*
Practice 5
Name: 蕭登鴻
Student Number: 111502552
Course 2023-CE1004-B
*/

#include <fstream>
#include <iostream>
#include <sstream>
#include <string>
#include <vector>

using namespace std;

class University {
public:
    int school_code, department_code, student_count, teacher_count, graduates_last_year;
    string school_name, department_name, day_or_night, level, city_name, system_type;

    void print() {
        cout << school_name << "\t" << department_name << "\t" << graduates_last_year << endl;
    }
};

ifstream input("./input.txt", ifstream::in);

int main() {
    vector<University> unis_v;

    short skip = 3;

    string line;
    while (getline(input, line, '\n')) {
        string s;

        if (skip > 0) {
            skip--;
            continue;
        }

        stringstream ss(line);

        University uni;

        getline(ss, s, '\t');
        uni.school_code = stoi(s);

        getline(ss, uni.school_name, '\t');

        getline(ss, s, '\t');
        uni.department_code = stoi(s);

        getline(ss, uni.department_name, '\t');

        getline(ss, uni.day_or_night, '\t');

        getline(ss, uni.level, '\t');

        getline(ss, s, '\t');
        uni.student_count = stoi(s);

        getline(ss, s, '\t');
        uni.teacher_count = stoi(s);

        getline(ss, s, '\t');
        uni.graduates_last_year = stoi(s);

        getline(ss, uni.city_name, '\t');

        getline(ss, uni.system_type, '\t');

        unis_v.push_back(uni);
    }

    for (auto uni : unis_v) {
        uni.print();
    }

    input.close();
}
