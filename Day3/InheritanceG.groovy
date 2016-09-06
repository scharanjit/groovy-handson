class A{}
class B extends A{}
def b= new B()
assert b in B && b in A
class A1{}
class A2{}
//class C extends A1, A2{}
//compile error when uncommented: a class can extend at most one class
