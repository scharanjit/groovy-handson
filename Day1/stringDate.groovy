stringDate="2016-09-01"

dateArray=stringDate.split("-")

println(stringDate)

year = dateArray[0].toInteger()
year = year + 1

newDate=year+"-"+dateArray[1]+"-"+dateArray[2]

println(newDate)