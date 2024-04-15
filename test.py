import pandas as pd
df=pd.read_excel('sheet1.xlsx')
df['c']=df['a'].astype(str)+df['b'].astype(str)
print(df)
df.to_excel('final_output.xlsx', index=False)
