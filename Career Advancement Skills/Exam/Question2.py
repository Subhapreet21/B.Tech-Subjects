def count_freq(sentence):
    sentence=sentence.lower()
    words=sentence.split()
    freq={}
    for word in words:
        if word in freq:
            freq[word]+=1
        else:
            freq[word]=1
    return freq

sentence="the cat and the hat"
print(count_freq(sentence))