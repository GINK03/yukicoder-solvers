from strutils import split, parseInt, replace
from math import sum
import sequtils

let
  line = readLine(stdin)

var ans = ""

var list = line.replace("?", "1").split().map(parseInt)
var mid = list[1]

if mid == list.min() or mid == list.max():
  ans.add("1")

list = line.replace("?", "4").split().map(parseInt)
mid = list[1]
if mid == list.min() or mid == list.max():
  ans.add("4")
echo(ans)
