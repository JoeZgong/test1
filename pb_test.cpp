// pb_test.cpp : Defines the entry point for the console application.
//


#include <stdio.h>
#include <Windows.h>

#include "ProgressBar.h"
123
;l;l;
int main()
{
	ProgressBar *gProgressBar;

	gProgressBar = new ProgressBar(std::string("Hello, ProgressBar Tesing!!"));

	int pos = 0;

	for (int index = 0; index <= 10; index++)
	{
		Sleep(1000);
		gProgressBar->setPercentageDone(pos);
		pos += 10;
	}



sfg
	printf("\nPress Any Key To Quit ... ...\n");
	getchar();

	delete gProgressBar;
    return 0;
}

