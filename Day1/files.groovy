myFileDirectory = "path_to_file"
myFileName = "myfile.txt"
myFile = new File(myFileDirectory + myFileName)
printFileLine = { println "File line: " + it }
myFile.eachLine( printFileLine )
