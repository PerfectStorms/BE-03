# Introduction to Git

## Homework

1. Go to the project from the [last lesson](../lesson01_introduction/README.md)
2. Add .gitignore & README.md files to the project.
3. index your files and commit like a *initial commit* (by default)
4. Push into your first github repository
5. Change your local files into project
6. Create a new commit with these changes and name it 'fix commit' (ctrl + K)
7. Push commit
8. Create a new branch from master and name it 'develop' 
9. Repeat tasks 5-7 in the new develop branch (try giving commits other names) 
10. Return (checkout) to the master branch and create another branch with name 'fix' 
11. Repeat tasks 5-7 in the new *fix* branch, but before push create 2 commits except 1 
12. Return (checkout) to the *develop* branch and merge *fix* branch to this branch 
13. Resolve merge conflicts 

>Tasks 8-13 are optional, as they are difficult to solve


## Tutorial

### 1. Download latest Git and install on your computer
You can download it [here](https://git-scm.com/downloads).

### 2. Register your personal [github account](https://github.com/). 
![register_area](https://git-scm.com/book/en/v2/images/signup.png)

### 3. Init git local repository
#### 3.1 Open the terminal. It's attached to the bottom panel, or call Alt+F12
#### 3.2 Enter there ```git init```

### 4. Сreate a *.gitignore* file in the root of the project
#### 4.1 Write the text below to *.gitignore* file 
```
/.idea
/out
/target
*.iml
```

### 5. Add a *README.md* file in the root of the project (project presentation)
#### 5.1 Write the text below to *README.md* file
```
This is my first project on github!
```

### 6. Create first commit
#### 6.1 Open the terminal
#### 6.2 Index all changes with command ```git add .```
#### 6.3 Commit changes with command ```commit -m 'My first commit'```

### 7. Link github account to Intellij Idea and share your project
![share_project](https://i.stack.imgur.com/Wuaun.png)

### 8. Check that your created repository exists

