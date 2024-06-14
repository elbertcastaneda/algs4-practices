# Clone the algs4 repository
git clone https://github.com/kevin-wayne/algs4

# Remove the existing edu directory (Source code of alg4 project)
rm -Rf ./src/main/java/edu

# Move the edu git's folder folder to the java's folder of this project source code
mv ./algs4/src/main/java/edu ./src/main/java/

# Move the edu git's folder folder to the java's folder of this project source code
rm -Rf ./algs4