# 작성자 : SH_WON_96
# 2020-10-04
# 알고리즘 - Trie
# 문제번호 : 1991 트리 순회

# 초기 입력값 받기
import sys
input = sys.stdin.readline
##

class Node:
    def __init__(self, item,left,right):
        self.item = item
        self.left = left
        self.right = right

def inorder(node):
    if node.left != ".":
        inorder(tree[node.left])
    print(node.item,end="")
    if node.right != ".":
        inorder(tree[node.right])


def preorder(node):
    print(node.item, end="")
    if node.left != ".":
        preorder(tree[node.left])
    if node.right != ".":
        preorder(tree[node.right])

def postorder(node):
    if node.left != ".":
        postorder(tree[node.left])
    if node.right != ".":
        postorder(tree[node.right])
    print(node.item, end="")



if __name__ == "__main__":
    N = int(input())
    tree = {}
    for i in range(N):
        data = input().rstrip().split()
        tree[data[0]] = Node(item=data[0],left=data[1],right=data[2])

    preorder(tree['A'])
    print()
    inorder(tree['A'])
    print()
    postorder(tree['A'])


