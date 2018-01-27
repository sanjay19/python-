def main():
   
  n=int(input(""))
  rev=0
  while(n>0):
    dig=n%10
    rev=rev*10+dig
    n=n//10
  print(rev)
if __name__ == '__main__':
    main()
