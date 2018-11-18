package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter Height: ")
	text, _ := reader.ReadString('\n')
	fmt.Print(text)
}
