package org.foo;

def build_echo() {
        echo 'build 1'
}
def build_input() {
        input 'Waiting for your orders, massssster'
}

class MyLib {
	int summ(int a, int b) {
		return a+b
	}
}
