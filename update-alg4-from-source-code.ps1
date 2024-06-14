# Clone the algs4 repository
git clone https://github.com/kevin-wayne/algs4

# Remove the existing edu directory (Source code of alg4 project)
Remove-Item -Recurse -Force .\src\main\java\edu

# Move the edu git's folder folder to the java's folder of this project source code
Move-Item -Path .\algs4\src\main\java\edu -Destination .\src\main\java\

# Remove the cloned repository
Remove-Item -Recurse -Force .\algs4