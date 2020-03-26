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
     */
}
