package tests;

public class GitNote {
    /*
    March 25, 2020
	Agenda:
		git conflicts
		git stash
###########################
black
<<<<<<< HEAD
red													| your changes
=======
pink												| your teammate changes
>>>>>>> 5860f28aecb5993fbea0aaff7d7ba99770eb12e2
How to we resolve a conflict?
	In git, conflict happens when 2 people modifying same file. So git doesn’t know how to combine changes from both of you automatically.
	To fix it, follow these steps:
once, git pull doesn’t work for you
git add .
git commit -m “commit message”
git pull
Then, git will show you conflicting files. You can manually go and
update files and leave content that you want. Then, just commit changes again.
 By doing this, we can decide what changes will stay, since git cannot decide automatically.
Fix conflicting files manually or use IDE in-build tools.
Then, commit again:
git add .
git commit -m “message”
git push

If you are getting: access denied, 403 error, means that you are trying to push to the repo that is not yours (you were not added as a collaborator or you are not the owner of this repo)
To reconnect with your repo:
git remote set-url origin <GITHUB_URL>
For example:
git remote set-url origin https://github.com/CybertekSchool/OnlineNewGitPractice2019.git
In case of conflict, if there were modified different files, git can merge automatically.
Whenever you have opened terminal text editor, to quit enter:
:q or :q!
:qw - so save changes and quit
force quit - control + c
The best way to resolve a conflict is to merge changes. Thus, you won't loose your updates and you will get updates from your teammates.
There is a another way how to handle conflict.
Let's say, if the code is not ready yet, so you cannot really merge changes since your code is not completed. You don't want to loose your changes, but also you don't want to merge changes. In this case, we can stash changes.
Stashing means temporary, remove your changes and put them in safe.
Once you will be ready, you can apply those stashed changes any time.
you have made changes to some file that was modified by your teammate as well
what you can do?
 - merge changes
 - just leave your changes
 - just accept changes
 - stash changes --- >

                git stash
every stash, has some id:
stash@{0}: WIP on master: 4923690 resolved conflict
stash@{0} - stash id,
WIP on master: 4923690 resolved conflict - stash message
once you have stashed your changes, they will be temporary removed from your code. But, they will not disappear. They will be stashed.
Once you stashed changes, you can easily pull updates:
git pull
Then, once you want to apply stashed changes again, just run:
    git stash pop --> it will apply last stash yo your code back. It will create a conflict, so you would need manually/with tools resolve the conflict.
if you have couple of stashes:
    git stash list -- to see all stashes
    git stash pop <stash_id> - to apply specific stash, not just latest one.
if you want to delete all stashes:
    git stash clear
delete specific one:
    git stash drop <stash_id>
Bad decision:
Instead of resolving conflict, sometimes people just clone project again, and move changes manually.
But people do it sometimes when they don't know how to resolve conflict properly.

     */
}
