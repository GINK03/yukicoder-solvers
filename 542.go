package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
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
	i1, _ := strconv.Atoi(ii[0])
	i2, _ := strconv.Atoi(ii[1])
	m := make(map[int]int)
	for e1 := 0; e1 <= i1; e1++ {
		for e2 := 0; e2 <= i2; e2++ {
			m[e1+e2*5] = 0
		}
	}
	ks := make([]int, 0)
	for k, _ := range m {
		ks = append(ks, k)
	}
	sort.Ints(ks)
	for _, k := range ks {
		if k != 0 {
			fmt.Println(k)
		}
	}
}
