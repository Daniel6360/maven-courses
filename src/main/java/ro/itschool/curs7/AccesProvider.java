package ro.itschool.curs7;

interface AccesProvider {
    void  open(int distance);

    void close();

    void lock();
}
