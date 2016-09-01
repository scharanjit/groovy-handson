def list =[1,2,'hello',"hello",new java.util.Date()]

assert list.size() == 5
assert list.get(2) == 'hello'
assert list[2] == 'hello'

println list

def map=['name':'Charanjit Singh', 'location':'Hyderabad']

println map

assert map.size() == 2
assert map.get('name') == 'Charanjit Singh'
assert map['name'] == 'Charanjit Singh'

def map1=['id':1, 'name':'Charanjit Singh', 'location':'Hyderabad']

def list1 = [1, 2, 3]
for (i in list1) { println i }


