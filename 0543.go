package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var sc = bufio.NewScanner(os.Stdin)

func read() string {
	sc.Scan()
	var input = sc.Text()
	return input
}

func main() {
	ii := strings.Split(read(), " ")
	fmt.Printf("%s %s\n", ii[1], ii[0])
}
