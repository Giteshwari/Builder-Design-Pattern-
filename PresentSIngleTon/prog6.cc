// Eager Initialization using C++

 #include <iostream>
class SingleTon
{
private:
    SingleTon()
    {
        std::cout << "Whats app opened" << std::endl;
    }

public:
    static SingleTon fun()
    {

        static SingleTon obj;

        std::cout << "New Msg" << std::endl;
        return obj;
    }
};

int main()
{

    std::cout << "Single Ton Patten" << std::endl;

    SingleTon obj1 = SingleTon::fun();
    SingleTon obj2 = SingleTon::fun();
    SingleTon obj3 = SingleTon::fun();
    SingleTon obj4 = SingleTon::fun();

    return 0;
}