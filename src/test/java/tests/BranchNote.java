package tests;

public class Branch {
    /*
    Today is April 1, 2020
Last class...
hahaha, actually no ;(
Agenda git branches
How do we track changes? For this, we have git, and whenever we make new scripts, or update something in our project, we make a commit.
commit - it's a snapshot of changes in the project at certain point.
______within master branch
commit #1 -- "Initial commit"
    BrowserUtilities
    ConfigurationReader
    TestBase
    Driver
    pom.xml
    configuration.properties
commit #2 -- "Added login tests class with 2 tests"
    LoginTests
commit #3 -- "Added login page class"
    LoginTests -- updated
    LoginPage
commit #4 -- "Added BasePage class"

    LoginPage -- updated
    BasePage
by default, git creates only one branch - master. It's like one history of your project. But also, you can create another branch and have different commits going in parallel.
At any point, you can create a new branch.
But, why do we need this?
First of all, it allows to keep latest stable and verified code in master branch. When you gonna on code, most likely you will be working on your own branch. Then, once you are done you can propose your changes to the main branch - master. It calls - pull request.
For example, developers they create a new branch for some feature. They can work within that branch alone and make commits. Then, once feature has been developed, developer can create a pull request to merge new code with master branch. Code, will be reviewed and tested by CI tests.
CI - continues integration (related to Jenkins)
who is gonna review? Owner of the repository. Some lead, main tester, main developer.
branch - represents independent line of development. Having 2 branches, it's like cloning project twice and work on 2 different versions. But when you clone project twice, to merge them, you would need to do it manually. When you have 2 branches, you can easily merge the code. Plus remotely, you will have that branch as well. Every branch has it's own history of commits. By creating new branch, you are getting brand new working directory.
git commit -a -m "added a new car" -- add and commit
git push - send our code to github
git pull - to get updates from github
git branch - to see list of branches
git branch <name> - create a new branch, branch out from the current branch - master.
git branch dev - create a new branch with name - dev.
git checkout <branch name> - to switch to another branch
git log --graph --oneline - see the commits history. Press q to exit.
git push --set-upstream origin <branch_name> - push branch to github
In my team, everyone has their own branch. We don't commit to the master branch directly. Instead, we work on our own branches. Master branch has latest stable and verified code. Once I complete my task, I create a pull request that will be verified by test lead/other tester.
how to merge branches locally?
switch to master branch
    git checkout master
merge
    git merge dev
once you have switched to master branch, it will import changes from dev branch.
git branch -d feature - Delete branch
git checkout -b feature - create and switch to the branch at the same time
git branch -m <new branch name> - rename current branch
vfomiuk@vfomiuk OnlineNewGitPractice2019 % git branch -d newfeature
error: Cannot delete branch 'newfeature' checked out at '/Users/vfomiuk/IdeaProjects/OnlineNewGitPractice2019'
-d - to delete
You cannot delete a branch, until you merge. If there are some commits.
Also, you cannot delete a branch until you are on that branch.
git branch -D <branch_name> - force delete
But make sure, you step out from that branch first.
    git checkout master
    git branch -D newfeature
Create new branch and switch to it:
    git checkout -b feature
before changing branch, commit !!!!!
vfomiuk@vfomiuk OnlineNewGitPractice2019 % git branch -d feature
error: The branch 'feature' is not fully merged.
If you are sure you want to delete it, run 'git branch -D feature'.
vfomiuk@vfomiuk OnlineNewGitPractice2019 % git merge feature
Updating a6b44ee..0d83351
Fast-forward
 movies.txt | 6 ++++++
 1 file changed, 6 insertions(+)
 create mode 100644 movies.txt
vfomiuk@vfomiuk OnlineNewGitPractice2019 % git branch -d feature
Deleted branch feature (was 0d83351).
After merging branches, we were able to delete feature branch.
once you see that window, enter :q and press return/enter
################

     */
}
