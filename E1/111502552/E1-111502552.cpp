#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Pokemon {
   private:
    int hp, attack;
    float power;

   public:
    Pokemon(int hp, int attack, float power) {
        this->hp = hp;
        this->attack = attack;
        this->power = power;
    }

    int getHp() {
        return hp;
    }

    int getAtk() {
        return attack;
    }

    float getPower() {
        return power;
    }

    int calcDamage(int multi) {
        if (power >= 1) {
            power = 0;
            return attack * multi;
        }

        power += 0.25;
        return attack;
    }

    void getDamage(int dmg) {
        hp -= dmg;
    }

    void heal(int delta) {
        hp += delta;
    }
};


int main() {
    int hp, atk;
    float power;

    cin >> hp >> atk >> power;
    Pokemon host(hp, atk, power);

    vector<Pokemon> pokes;

    int N;
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> hp >> atk >> power;
        Pokemon p(hp, atk, power);
        pokes.push_back(p);
    }

    cout << "Function Choose:";
    string mode;
    cin >> mode;
    if (mode == "1") {
        for (auto &p : pokes) {
            cout << "Hp:" << p.getHp() << " "
                 << "Attack:" << p.getAtk() << " "
                 << "Power:" << p.getPower() << endl;
        }
    } else if (mode == "2") {
        // flag: 0: me win, 1: host win
        int cur_poke = 0, battle_cnt = 0, win_flag = -1;
        while (true) {
            // my turn
            Pokemon &p = pokes[cur_poke];

            host.getDamage(p.calcDamage(3));
            battle_cnt++;

            // check host status
            if (host.getHp() <= 0) {
                win_flag = 0;
                break;
            }

            // host's turn
            int dmg = host.calcDamage(2);
            host.heal((int)dmg / 5);

            p.getDamage(dmg);
            battle_cnt++;

            if (p.getHp() <= 0) {
                cur_poke++;

                if (cur_poke == pokes.size()) {
                    win_flag = 1;
                    break;
                }
            }
        }

        if (win_flag == 0) {
            cout << "You win! ";
        } else {
            cout << "You lose! ";
        }

        cout << "Using " << battle_cnt << " rounds!";
    } else if (mode == "3") {
        cout << 'B' << endl;
    } else {
        cout << "Error";
    }
}
